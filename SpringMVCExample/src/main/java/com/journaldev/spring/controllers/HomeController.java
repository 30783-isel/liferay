package com.journaldev.spring.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.http.client.HttpClient;
import com.http.client.HttpRequest;
import com.http.client.HttpRequest.Builder;
import com.http.client.HttpResponse;
import com.http.client.HttpService;
import com.journaldev.spring.auxiliares.LinkMenu;
import com.journaldev.spring.beans.MenuObj;
import com.journaldev.spring.beans.User;
import com.journaldev.spring.beans.context.ConvertJsonToObjectClss;
import com.journaldev.spring.beans.context.WorkWithPdf;
import com.journaldev.spring.beans.context.WorkWithXLSX;
import com.journaldev.spring.domain.SpringProperties;
import com.journaldev.spring.exceptions.HomeException;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private static final String SERVERMESSAGE = "serverMessage";

	protected Properties serverProperties;

	@Autowired(required = true)
	SpringProperties propertiesBean;

	User[] users;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		// TestarGitHub

		logger.info("Welcome home! The client locale is {}.", locale);

		ModelAndView mv = new ModelAndView("views/home");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		mv.addObject("serverTime", formattedDate);
		mv.addObject("menu", listMenu());
		return mv;
	}

	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public ModelAndView loginPage(Locale locale) {
		ModelAndView mv = new ModelAndView("views/login");
		mv.addObject("menu", listMenu());
		return mv;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView login(@Validated User user) {
		ModelAndView model = new ModelAndView("views/user");
		model.addObject("userName", "terelowmow");
		model.addObject("menu", listMenu());
		return model;
	}

	@RequestMapping(value = "/testarFetch", method = RequestMethod.GET)
	public ModelAndView testarFetch(Locale locale) throws Exception {
//		teste
//		teste
		ModelAndView model = new ModelAndView("views/homeTestJsp");
		try {
			httpGet(User.class);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addObject("serverTime", formattedDate);

		model.addObject("userName", "Janga");
		model.addObject("listaMenu", createList());
		model.addObject(SERVERMESSAGE, propertiesBean.getMessages().get("msg.notedit.empty.loadpage"));
		model.addObject("menu", listMenu());
		return model;
	}

	@RequestMapping(value = "/acessView", method = RequestMethod.GET)
	public ModelAndView getAccessToView(Locale locale) throws Exception {
		ModelAndView model = new ModelAndView("views/homeTestJsp");
		User[] users = null;
		try {
			users = httpGet(User.class);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addObject("serverTime", formattedDate);

		model.addObject("userName", "Janga");
		model.addObject("listaMenu", createList());
		model.addObject("users", users);

		setUsers(users);

		model.addObject(SERVERMESSAGE, propertiesBean.getMessages().get("msg.notedit.empty.loadpage"));
		model.addObject("menu", listMenu());

		return model;
	}

	@RequestMapping(value = "/xlsx", method = RequestMethod.GET)
	public ModelAndView createXLSX() {
		ModelAndView mv = new ModelAndView("views/xlsx");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WorkWithXLSX WorkWithXLSX = context.getBean(WorkWithXLSX.class);

		try {
			WorkWithXLSX.convertToXLSX(getUsers());
		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		mv.addObject("menu", listMenu());

		return mv;
	}

	@RequestMapping(value = "/pdf", method = RequestMethod.GET)
	public ModelAndView createPDF() {
		ModelAndView mv = new ModelAndView("views/pdf");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WorkWithPdf workWithPdf = context.getBean(WorkWithPdf.class);

		workWithPdf.generatePDF(getUsers());

		return mv;
	}

	private <T> T createList() {
		List<MenuObj> lista = new ArrayList<MenuObj>();
		for (int i = 0; i < 10; i++) {
			MenuObj menuObj = new MenuObj();
			menuObj.setId(i);
			menuObj.setNome(Integer.toString(i));
			lista.add(menuObj);
		}
		return (T) lista;
	}

	private <T> User[] httpGet(Class<T> entityType) throws Exception {

		HttpResponse responseHttpReceived = null;
		T users = null;
		String path = null;
		try {
			Builder requestServiceBuilder = usersServiceBuilder(path);
			responseHttpReceived = requestServiceBuilder.build().get();
		} catch (HomeException e) {
			e.printStackTrace();
		}

		try {
			users = homeEntityGet(entityType, responseHttpReceived);
		} catch (IllegalAccessException | HomeException e) {
			e.printStackTrace();
		}

		return (User[]) users;
	}

	private HttpRequest.Builder usersServiceBuilder(String path) throws Exception {

		Builder requestServiceBuilder = null;
		try {

			String requestURL = (String) "http://jsonplaceholder.typicode.com/users";
			HttpClient.Builder builder = new HttpClient.Builder(requestURL);
			HttpClient httpClient = HttpClient.getInstance(builder.build());
			HttpService requestService = new HttpService.Builder(httpClient).header("accept", "application/xml").header("no-cache", "false").build();
			requestServiceBuilder = new HttpRequest.Builder(requestService);

		} catch (Exception e) {
			throw new HomeException(HomeException.ERROR_NO_RESULTS, HomeException.TYPE_ERROR, "An Exception occurred on client Data Request creation.");
		}
		return requestServiceBuilder;
	}

	private <T> T homeEntityGet(Class<T> entityType, HttpResponse responseHttpReceived) throws IllegalAccessException, HomeException {

		T responseEntity = null;
		User[] users = null, userx = null;
		try {
			responseEntity = entityType.newInstance();

			logger.info("Response Status: " + responseHttpReceived.getStatus());

			switch (responseHttpReceived.getStatus()) {
			case 200:
			case 201:
				String strResponse = null;
				try {
					strResponse = responseHttpReceived.getEntity(String.class);
					logger.info("Response Received (raw response): " + strResponse);

					ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
					ConvertJsonToObjectClss<User[]> convertJsonToObjectClss = context.getBean(ConvertJsonToObjectClss.class);
					convertJsonToObjectClss.setValueType(User[].class);

					userx = convertJsonToObjectClss.convertJsonToObjWithJackson(strResponse);
					showJsonToObjectTransformedUsers(userx);

					users = convertJsonToObjectClss.convertJsonToObjWithGson(strResponse);
					showJsonToObjectTransformedUsers(users);

					Class<? extends Object> t = responseEntity.getClass();
					logger.info(t.toString());
				} catch (Exception ex) {
					logger.error(ex.getMessage());
				}
			}
		} catch (InstantiationException e) {
			logger.error("Exception detected: " + e.getMessage());
			throw new HomeException(HomeException.ERROR_NO_RESULTS, HomeException.TYPE_ERROR, "Não foi possível processar o pedido.");
		}
		return (T) users;
	}

	private void showJsonToObjectTransformedUsers(User[] users) {
		for (User user : users) {
			logger.info(user.getName());
			logger.info(user.getEmail());
			logger.info(user.getUsername());
			logger.info(user.getPhone());
			logger.info(user.getWebsite());

			logger.info(user.getAddress().getCity());
			logger.info(user.getAddress().getStreet());
			logger.info(user.getAddress().getSuite());
			logger.info(user.getAddress().getZipcode());
			logger.info(user.getAddress().getGeo().getLat());
			logger.info(user.getAddress().getGeo().getLng());

			logger.info(user.getCompany().getName());
			logger.info(user.getCompany().getBs());
			logger.info(user.getCompany().getCatchPhrase());

			logger.info("-------------------------------------------------------------");
		}
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public List<LinkMenu> listMenu() {

		List<LinkMenu> lista = new ArrayList<LinkMenu>();
		LinkMenu linkMenuServerTime = new LinkMenu("/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/", "Server Time");
		lista.add(linkMenuServerTime);
		LinkMenu linkMenuLogin = new LinkMenu("/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/login1", "Login");
		lista.add(linkMenuLogin);
		LinkMenu linkMenuListarUtilizadores = new LinkMenu("/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/acessView", "Listar utilizadores");
		lista.add(linkMenuListarUtilizadores);
		LinkMenu linkMenuTestarJavascriptFetch = new LinkMenu("/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/testarFetch", "Testar Javascript Fetch");
		lista.add(linkMenuTestarJavascriptFetch);
		LinkMenu linkMenuXLSX = new LinkMenu("/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/xlsx", "XLSX");
		lista.add(linkMenuXLSX);
		LinkMenu linkMenuPDF = new LinkMenu("/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/pdf", "PDF");
		lista.add(linkMenuPDF);

		return lista;
	}

}