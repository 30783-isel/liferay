
/**
/**
 * Este método vai ajustar a altura do div <code>#content-detail</code> consoante a 
 * altura da página, do <code>#content-header</code> e do <code>#content-footer</code>.
 *
 * @author Accenture
 * @since 3.0.0 - 10.12.2015 
 */
function contentResize(){
	headerResize();
	
	var bodyHeight = $('body').height();
	var contentHeaderHeight = $('#content-header').height();
	var contentFooterHeight = $('#content-footer').height();
	var contentDetailHeight = bodyHeight - contentHeaderHeight - contentFooterHeight;

	$('#content-detail').css('min-height', contentDetailHeight);
	$('#content').css('max-height', bodyHeight);
	
	if ($('#content').prop('offsetHeight') + isIE() < $('#content').prop('scrollHeight')) {
		$('#content').css('margin-left', 17).css('overflow-y', 'scroll');
	} else {
		$('#content').css('margin-left', '').css('overflow-y', 'hidden');
	}
	
	if($('#main-menu').length && !$('#main-menu #excBox').length)
		homePageResize();
		
	$('.error-msg').each(function(){
		var parentWidth = $(this).parent().css("width");
		$(this).css( 'width' , parentWidth );
		if ( parentWidth == "0px")
			$(this).css( 'visibility', 'hidden');
		else
			$(this).css( 'visibility', '');
//		if ( parentWidth == "0px")
//			$(this).css( 'display', 'none');
//		else
//			$(this).css( 'display', '');
	});
	
	if($('.scmlContent').length){
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
	$('.navbar, .navbar-nav, .navbar-header, .navbar-toggle, .navbar-left, .navbar-right, ' +
		'.navbar-collapse, .navbar-collapse.collapse, .navbar-collapse.in, .navbar-fixed-top, ' +
		'.navbar-static-top, .navbar-fixed-bottom, #user').removeClass('forcedColapse');
	
	if (parseInt($('.navbar.navbar-default').height()) > 40)
	{
		$('.navbar, .navbar-nav, .navbar-header, .navbar-toggle, .navbar-left, .navbar-right, ' +
			'.navbar-collapse, .navbar-collapse.collapse, .navbar-collapse.in, .navbar-fixed-top, ' +
			'.navbar-static-top, .navbar-fixed-bottom, #user').addClass('forcedColapse');
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
	
	$.each(areas, function(i, area){
		
		if (currPos == $(area).offset().top) {
			var height = $(area).height();
			if (height > biggestArea)
				biggestArea = height;
			
		} else {
			//resize previous row
			$(row).css('height', biggestArea + isIE());
			$(row).removeClass('row');
			
			currPos = $(area).offset().top;
			biggestArea = $(area).height();
		}
		
		$(area).addClass('row');
	});
	
	//resize last row
	$(row).css('height', biggestArea);
	$(row).removeClass('row');
}