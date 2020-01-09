function callController(){
	
	console.log('callController');
	
	fetch('/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/testarFetch')
	  .then(response => response.json())
	  .then(data => console.log(data))
}


/**
 * Method to toggle search Menu visibility onToggleSearchMenuFunction() is a
 * function defined on each page js with page custom content
 */
function toggleScmlSearchMenu() {
	if ($('#searchMenuContainer').hasClass('hidden')) {
		$('#searchMenuContainer').closest('td').animate({
			width : "410px" }, function() {
			$('#searchMenuContainer').removeClass('hidden');
			if ($("#extraction-container").length) {
				// necessary for extractions pages
				checkUlSize();
			}
		});
		$('#searchMenuExpandCollapseArrow').removeClass('glyphicon-menu-right');
		$('#searchMenuExpandCollapseArrow').addClass('glyphicon-menu-left');
	} else {
		$('#searchMenuContainer').closest('td').animate({
			width : "0px" }, function() {
			if ($("#extraction-container").length) {
				// necessary for extractions pages
				checkUlSize();
			}
		});
		$('#searchMenuContainer').addClass('hidden');
		$('#searchMenuExpandCollapseArrow').removeClass('glyphicon-menu-left');
		$('#searchMenuExpandCollapseArrow').addClass('glyphicon-menu-right');
	}
}