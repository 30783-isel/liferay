
var areaPath = "/UsersMng";

//Properties for spinner and spinner message
var spinnerMsgDelay 	= 15000;
var spinnerMsgDuration 	= 7000;
var waitMessage 		= '<p>Aguarde por favor...</p><p>Estamos a processar o seu pedido!</p>';
var spinnerCounter 		= 0;

/**
 * /** Este método vai ajustar a altura do div <code>#content-detail</code>
 * consoante a altura da página, do <code>#content-header</code> e do
 * <code>#content-footer</code>.
 * 
 * @author Accenture
 * @since 3.0.0 - 10.12.2015
 */
function contentResize() {
	headerResize();

	var bodyHeight = $('body').height();
	var contentHeaderHeight = $('#content-header').height();
	var contentFooterHeight = $('#content-footer').height();
	var contentDetailHeight = bodyHeight - contentHeaderHeight
			- contentFooterHeight;

	$('#content-detail').css('min-height', contentDetailHeight);
	$('#content').css('max-height', bodyHeight);

	if ($('#content').prop('offsetHeight') + isIE() < $('#content').prop(
			'scrollHeight')) {
		$('#content').css('margin-left', 17).css('overflow-y', 'scroll');
	} else {
		$('#content').css('margin-left', '').css('overflow-y', 'hidden');
	}

	if ($('#main-menu').length && !$('#main-menu #excBox').length)
		homePageResize();

	$('.error-msg').each(function() {
		var parentWidth = $(this).parent().css("width");
		$(this).css('width', parentWidth);
		if (parentWidth == "0px")
			$(this).css('visibility', 'hidden');
		else
			$(this).css('visibility', '');
		// if ( parentWidth == "0px")
		// $(this).css( 'display', 'none');
		// else
		// $(this).css( 'display', '');
	});

	if ($('.scmlContent').length) {
		setTimeout(setScmlContentHeight(), 50);
	}
};

/**
 * Este método colapsa o header no caso de o conteúdo não caber em largura.
 * Adiciona uma classe que se sobrepõe às utilizadas pelo bootstrap.
 * 
 * @author Accenture
 */
function headerResize() {
	$(
			'.navbar, .navbar-nav, .navbar-header, .navbar-toggle, .navbar-left, .navbar-right, '
					+ '.navbar-collapse, .navbar-collapse.collapse, .navbar-collapse.in, .navbar-fixed-top, '
					+ '.navbar-static-top, .navbar-fixed-bottom, #user')
			.removeClass('forcedColapse');

	if (parseInt($('.navbar.navbar-default').height()) > 40) {
		$(
				'.navbar, .navbar-nav, .navbar-header, .navbar-toggle, .navbar-left, .navbar-right, '
						+ '.navbar-collapse, .navbar-collapse.collapse, .navbar-collapse.in, .navbar-fixed-top, '
						+ '.navbar-static-top, .navbar-fixed-bottom, #user')
				.addClass('forcedColapse');
	}
}

/**
 * Este método ajusta a altura do div das diferentes áreas na home page
 * consoante a altura da maior de cada liha.
 * 
 * @author Accenture
 */
function homePageResize() {
	var biggestArea = 0;
	var row = '.media-body.row';

	var areas = $('#main-menu .media-body');
	var currPos = $(areas.get(0)).offset().top;
	$(areas).removeAttr("style");

	$.each(areas, function(i, area) {

		if (currPos == $(area).offset().top) {
			var height = $(area).height();
			if (height > biggestArea)
				biggestArea = height;

		} else {
			// resize previous row
			$(row).css('height', biggestArea + isIE());
			$(row).removeClass('row');

			currPos = $(area).offset().top;
			biggestArea = $(area).height();
		}

		$(area).addClass('row');
	});

	// resize last row
	$(row).css('height', biggestArea);
	$(row).removeClass('row');
}

/**
 * Esta função retorna '1' se o cliente está a utilizar o Internet Explorer ou
 * '0' se estiver a usar qualquer outro.
 * 
 * @author Accenture
 */
function isIE() {
	var result = 0;
	var userAgent = window.navigator.userAgent;

	if (userAgent.indexOf("MSIE ") > -1 || userAgent.indexOf("Trident/") > -1
			|| userAgent.indexOf("Edge/") > -1)
		result = 1;

	return result;
}

// sets scml pages to adequate height soupSearchDetailsContainer
function setScmlContentHeight() {
	var tdContainerHeight = $('#content').height() - 20;
	var tdContainerActionsHeight = $('#scmlContentHeader').height();

	$('#scmlSearchMenu').height(tdContainerHeight);
	$('#scmlDividerExpandCollapse').height(tdContainerHeight);
	$('#scmlResult').height(tdContainerHeight);

	$('#searchMenuExpandCollapsePlaceHolder').height(tdContainerHeight - 120);

	if ($('#scmlContentHeader') != null) {
		$('#scmlContentResult').height(
				tdContainerHeight - tdContainerActionsHeight);
	} else {
		$('#scmlContentResult').height(tdContainerHeight);
	}
	$('#soupSearchDetailsContainer').height($('#scmlContentResult').height());

	// necessary for extractions pages
	if ($('#scmlContentResult').hasClass('passiveLotteryContentResult')) {
		if ($('#scmlContentHeader') != null) {
			$('#scmlContentResult').height(
					(tdContainerHeight - tdContainerActionsHeight) + 7);
		} else {
			$('#scmlContentResult').height(tdContainerHeight + 7);
		}
		if ($("#extraction-container").length) {
			checkUlSize();
		}
	}

	// necessary for system management pages
	if ($("#admin-container").length) {
		$('#scmlContentResult').height($('#scmlContentResult').height() - 70);
		checkUlSize();
	}
}

/**
 * Function to scroll tabs while active tab is partially or completely hidden
 * 
 * @author Accenture
 */
function checkTabsScroll(id, applyDefScroll) {
	if (!$(".arrow").hasClass("hidden")
			&& $("#tabs-list-container").hasClass("arrow-scroll")) {
		var tabsWidth = tabsWidthById(id);
		if (tabsWidth > $("#tabs-list-container").width()) {
			goRight(applyDefScroll);
			checkTabsScroll(id, applyDefScroll);

		} else if (tabsWidth < $($("#tabs-list .tab #" + id).parent("li"))
				.width()) {
			goLeft(applyDefScroll);
			checkTabsScroll(id, applyDefScroll);
		}
	}
}

/**
 * Validates {@code #tabs-list-container} width and adjusts the components
 * 
 * @author Accenture
 */
function checkUlSize() {
	var containerWidth = $("#games-form").width();
	var tabsWidth = sumTabsWidth();

	if (tabsWidth <= containerWidth) {
		right = 0;
		$(".arrow").addClass("hidden");
		$("#tabs-list .tab").css("right", right);
		$("#tabs-list-container").removeClass("arrow-scroll");

	} else {
		$(".arrow").removeClass("hidden");
		$(".arrow a").removeClass("disabled");
		$("#tabs-list-container").addClass("arrow-scroll");

		if (right == 0) {
			$("#goleft").addClass("disabled");

		} else {
			containerWidth = $("#tabs-list-container").width();

			if ((tabsWidth - right) < containerWidth) {
				right = right - (containerWidth - (tabsWidth - right));
				$("#tabs-list .tab").css("right", right);
			}

			if (tabsWidth <= (containerWidth + right))
				$("#goright").addClass("disabled");
		}

		var activeTab = $("#tabs-list .tab.active a");
		if (activeTab.length > 0) {
			checkTabsScroll($(activeTab).attr("id"), false);
		}
	}
}

/**
 * Função responsável pelas Checbox's
 */
function clickChecbox(checkbox) {
	// On change all-checkbox
	if (checkbox == "#profiles-table thead input[type=checkbox]") {

		var value = $(checkbox).is(':checked');
		var nextElem = $('#profiles-table tbody tr');

		$.each(nextElem, function(i, field) {
			if (value && field.style.display != 'none') {
				if (areaPath != "/FunctionMng"
						|| $(this).find('input.data').attr(
								'data-parentOperation') != 0) {
					$(this).addClass('selected');
					$(this).find('input').prop('checked', value);
				}

			} else {
				$(this).removeClass('selected');
				$(this).find('input').prop('checked', value);
			}
		});
		stateButtonToggle();
	}
	// On change checkbox nas Operations
	else if (areaPath == "/OperationsMng") {

		var value = $(checkbox).is(':checked');
		var id = $(checkbox).parents('tr.row').attr('id');
		var idParent = $(checkbox).parents('tr.row').find('input.data').attr(
				'data-parentOperation');
		var state = $(checkbox).parents('tr.row').find('input.data').attr(
				'value');
		var nextElem = $('#profiles-table tbody tr');
		var allChildsY = 0;
		var selectChildsY = 0;
		var selectChildsN = 0;

		if (!value) {
			$(checkbox).parents('.table-container').find('thead input').prop(
					'checked', value);
		}

		$(checkbox).parents('tr').toggleClass('selected');

		$
				.each(
						nextElem,
						function(i, field) {
							if ($(this).find('input.data').attr(
									'data-parentOperation') == idParent
									&& $(this).find('input.data').attr('value') == "Sim") {

								allChildsY++;
							}

							if ($(this).find('input.data').attr(
									'data-parentOperation') == idParent
									&& $(this).find('input.data').attr('value') == "Sim"
									&& $(this).is('.selected')) {

								selectChildsY++;
							}

							if ($(this).find('input.data').attr(
									'data-parentOperation') == idParent
									&& $(this).find('input.data').attr('value') == "Não"
									&& $(this).is('.selected')) {

								selectChildsN++;
							}
						});

		$
				.each(
						nextElem,
						function(i, field) {
							if (value
									&& field.style.display != 'none'
									&& $(this).find('input.data').attr(
											'data-parentOperation') == id) {
								$(this).addClass('selected');
								$(this).find('input').prop('checked', value);

							} else if (!value
									&& $(this).find('input.data').attr(
											'data-parentOperation') == id) {
								$(this).removeClass('selected');
								$(this).find('input').prop('checked', value);

							} else if (value
									&& field.style.display != 'none'
									&& $(this).attr('id') == idParent
									&& ((allChildsY == selectChildsY && $(this)
											.find('input.data').attr('value') == "Sim") || (state == "Não" && $(
											this).find('input.data').attr(
											'value') == "Não"))) {

								$(this).addClass('selected');
								$(this).find('input').prop('checked', value);

							} else if (!value
									&& $(this).attr('id') == idParent
									&& (($(this).find('input.data').attr(
											'value') == "Sim" && state == "Sim") || (selectChildsN == 0 && $(
											this).find('input.data').attr(
											'value') == "Não"))) {
								$(this).removeClass('selected');
								$(this).find('input').prop('checked', value);
							}

						});
		stateButtonToggle();
	}
	// On change checkbox
	else {

		var value = $(checkbox).is(':checked');

		if (!value) {
			$(checkbox).parents('.table-container').find('thead input').prop(
					'checked', value);
		}

		$(checkbox).parents('tr').toggleClass('selected');

		stateButtonToggle();
	}
}

/**
 * Função para o botão alterar estado
 */
function stateButtonToggle() {

	if ($('#profiles-table tbody').find('tr.selected').length > 0) {
		$('#state_btn').prop('disabled', false);

	} else {
		$('#state_btn').prop('disabled', true);
	}
}


/**
 * Este método efectua um pedido ajax do tipo GET com o url fornecido no
 * parametro <code>fURL</code> e coloca a resposta do servidor no elemento Dom
 * especificado no parametro <code>responseContainer</code>. A resposta
 * re-escreve ou é concatenada consoate o campo <code>_overwrite</code>. Em
 * caso de erro, será construida uma resposta genéria e colocada no elemento DOM
 * com o id <code>content-detail</code>. <br>
 * O header da resposta do servidor poderá ter informação para reescrever o
 * destino e o modo de como o método processa o conteúdo. <br>
 * Poderá ser enviada uma função (<code>_myFunction</code>)a ser executada
 * após a receção do pedido ajax. Para a mesma ser executada em caso de erro, o
 * campo <code>_runFunctionOnError</code> deverá ser <code>true</code>.
 * 
 * @param _fURL
 *            Url completo para o qual irá fazer o pedido.
 * @param _responseContainer
 *            Elemento do DOM onde o conteúdo de sucesso será colocado.
 * @param _overwrite
 *            Se vier a <code>True</code> a resposta reescreve o conteúdo do
 *            elemento DOM. Se vier a <code>False</code>, ele concatena no
 *            fim do DOM.
 * @param _myFunction
 *            [opcional] Função a correr após receção do pedido ajax.
 * @param _runFunctionOnError
 *            [opcional] Se vier a <code>True</code> _myFunction irá correr
 *            caso a resposta do pedido ajax seja de erro ou sucesso. Se vier a
 *            <code>False</code>_myFunction irá correr apenas no caso de
 *            resposta do pedido ajax ser de sucesso.
 * @author Accenture
 * @since 3.0.0 - 06-01-2016
 */
function ajaxRequestGet(_fURL, _responseContainer, _overwrite, _myFunction,
		_runFunctionOnError) {

	_fURL = encodeURI(_fURL.replace(/&$/, '')); /*
												 * Retira o último caractere se
												 * for & e depois aplica o
												 * encodeURI
												 */

	(typeof console !== 'undefined')
			&& console.log("\t_fURL : " + _fURL.replace(/&/g, "\n\t\t"));

	// Show spinner and spinner waiting message
	var localTimer = showSpinner();

	$
			.ajax({
				type : "GET",
				url : _fURL,
				cache : false,
				success : function(data, status, xhr) {

					var responseContainer;
					var ctrlrLocationOverride = xhr
							.getResponseHeader('LocationOverride');

					if (ctrlrLocationOverride != null
							&& ctrlrLocationOverride != ''
							&& $(ctrlrLocationOverride).length) {

						// if ( ctrlrLocationOverride == 'PAGE' ){
						// document.open();
						// document.write(xhr.responseText);
						// document.close();
						// } else {
						responseContainer = $(ctrlrLocationOverride);
						_overwrite = true;
						// }
					} else if (_responseContainer != null
							&& _responseContainer.length) {
						responseContainer = _responseContainer;
					} else {
						(typeof console !== 'undefined')
								&& console
										.log('\tResponse Container undefined!');
						return false;
					}

					if (_overwrite == true) {
						$(responseContainer).empty().append(data);
					} else if (_overwrite == false) {
						$(responseContainer).append(data);
					} else {
						(typeof console !== 'undefined')
								&& console
										.log("\tUnable to determine if should append or rewrite response container.");
						return false;
					}

					// Hide spinner and spinner waiting message and
					// clearInterval
					hideSpinner(localTimer);
					// $('#loading-indicator').delay(18000).hide(0);

					if (_myFunction !== undefined && _myFunction !== null) {
						_myFunction();
					}

					contentResize();

				},
				error : function(xhr, ajaxOptions, thrownError) {

					if ($(_responseContainer).is("#modal-container")) {
						modalWarning(errorMsg, imgTypeError);
					} else if ($(_responseContainer)
							.hasClass('modal-inner-msg')) {
						innerModalWarning(errorMsg, imgTypeError);
					} else {
						contentDetailWarning(errorMsg, imgTypeError);
					}

					// Hide spinner waiting message and clearInterval
					hideSpinner(localTimer);
					// $('#loading-indicator').delay(1000).hide(0);

					if (_myFunction !== undefined && _myFunction !== null
							&& _runFunctionOnError == true) {
						_myFunction();
					}
				}
			});
}

/**
 * This function show spinner window and start spinner waiting message timer
 */
function showSpinner() {
//	console.log("Enter showSpinner()...");
	
//	console.log("spinnerMsgDelay: " + spinnerMsgDelay);
//	console.log("spinnerMsgDuration: " + spinnerMsgDuration);
	spinnerCounter++;
	$('#loading-indicator').show();
	
	// Timer to show long waiting message
	var timer = setInterval(
		function(){
//			console.log("Enter setInterval function...");
			
			$('#loading-indicator > div .spinner-message').html('').html(waitMessage).fadeIn(300);
			$('#loading-indicator > div .spinner-message').delay(spinnerMsgDuration).fadeOut(300);
			
		}, spinnerMsgDelay
	);
	
	return timer;
}

/**
 * This function hide spinner window and stop spinner waiting message timer
 */
function hideSpinner(_timer) {
//	console.log("Enter hideSpinner()...");
	
	// Hide spinner waiting message
	setTimeout(function() {
		spinnerCounter--;
		if(spinnerCounter == 0) {
			$('#loading-indicator').hide();
		} 
			
		// Clear interval loop
		clearInterval(_timer);
	}, 1000);
	
}



