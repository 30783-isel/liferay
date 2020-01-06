package com.journaldev.spring.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.http.client.HttpClient;
import com.http.client.HttpRequest;
import com.http.client.HttpRequest.Builder;
import com.http.client.HttpResponse;
import com.http.client.HttpService;
import com.journaldev.spring.beans.User;
import com.journaldev.spring.beans.context.ConvertJsonToObjectClss;
import com.journaldev.spring.exceptions.HomeException;
import com.journaldev.spring.operations.PassiveLotteryProperties;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	protected Properties serverProperties;
	PassiveLotteryProperties propertiesBean;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {

		logger.info("Welcome home! The client locale is {}.", locale);

		ModelAndView mv = new ModelAndView("views/home");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		mv.addObject("serverTime", formattedDate);

		return mv;
	}

	@RequestMapping(value = "/login1", method = RequestMethod.GET)
	public ModelAndView loginPage(Locale locale) {
		ModelAndView mv = new ModelAndView("views/login");
		return mv;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView login(@Validated User user) {
		ModelAndView model = new ModelAndView("views/user");
		model.addObject("userName", "terelowmow");
		return model;
	}

	@RequestMapping(value = "/testarFetch", method = RequestMethod.GET)
	public ModelAndView testarFetch() throws Exception {
		ModelAndView model = new ModelAndView("views/home");

		try {
			httpGet(User[].class);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		model.addObject("userName", "terelowmow");
		return model;
	}

	private <T> T httpGet(Class<T> entityType) throws Exception {

		T data = entityType.newInstance();
		HttpResponse responseHttpReceived = null;

		String path = null;
		try {
			Builder requestServiceBuilder = usersServiceBuilder(path);
			responseHttpReceived = requestServiceBuilder.build().get();
		} catch (HomeException e) {
			e.printStackTrace();
		}

		try {
			data = homeEntityGet(entityType, responseHttpReceived);
		} catch (IllegalAccessException | HomeException e) {
			e.printStackTrace();
		}

		return data;
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
			throw new Exception();
			// throw new HomeException(HomeException.ERROR_NO_RESULTS,
			// HomeException.TYPE_ERROR,
			// "An Exception occurred on client Data Request creation.");
		}
		return requestServiceBuilder;
	}

	private <T> T homeEntityGet(Class<T> entityType, HttpResponse responseHttpReceived) throws IllegalAccessException, HomeException {
		T responseEntity = null;
		Gson gson = new Gson();
		GsonBuilder builder = new GsonBuilder();
		gson = builder.create();

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

					User[] userx = (User[]) convertJsonToObjectClss.convertJsonToObjWithJackson(strResponse);
					showJsonToObjectTransformedUsers(userx);
					
					User[] users = (User[]) convertJsonToObjectClss.convertJsonToObjWithGson(strResponse);
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
		return responseEntity;
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

}