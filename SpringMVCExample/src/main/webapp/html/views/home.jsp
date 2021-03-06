<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>
<html>
<head>

<link href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/css/menu.css" rel="stylesheet">
<link href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/css/sharedStyleSheet.css" rel="stylesheet">
<link href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/css/sharedStyleSheetAlt.css" rel="stylesheet">
<link href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/css/passivelottery.css" rel="stylesheet">

<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/javascript/menu.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-1.11.3.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-ui.min.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/auxiliares.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/sharedJavaScript.js"></script>

<title>Home</title>
</head>
<body>
	<%-- ---------------------------------- header ---------------------------------- --%>
	<div id="common-header">
		<jsp:include page="/html/views/commonx/pageHeader.jsp" />
	</div>

	<div id="content" class="content scmlContent passiveLotteryContent">
		<div id="content-detail" class="container scmlContainer passiveLotteryContainer">
			<table class="table table-bordered mainTable scml-table-common">
				<tbody>
					<tr>
						<td>
							<div id="searchMenuContainer">
								<div class="col-md-4 col-xs-4">
									<strong>Inserir valor</strong>
								</div>

								<div class="col-md-6 col-xs-6">
									<div class="form-group" style="min-width: 100%;">
										<div class="btn-group" style="min-width: 100%;">
											<div class="input-group" style="min-width: 100%;">
												<input id="extractionCode" name="extractionCode" data-regex="^([0-9]){3}/([0-9]{4})$" autocomplete="off" type="text" class="form-control" maxlength="8" data-required="N"
													style="width: 100%;"> <span class="input-group-addon add-on" data-toggle="tooltip" data-placement="top" data-html="true" title=""
													data-original-title="Insira o código da extração no formato (sss/AAAA)"> <span class="glyphicon glyphicon-question-sign"></span>
												</span>
											</div>
										</div>
									</div>
								</div>


								<div id="passiveLotterySearchMenuButtons" class="row">
									<div class="col-md-4 col-xs-4">
										<button type="button" class="btn btn-danger btn-left pull-left waves-effect waves-light" onclick="location.href='/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/'">Limpar</button>
									</div>
									<div class="col-md-4 col-xs-4"></div>
									<div class="col-md-4 col-xs-4">
										<button type="button" class="btn btn-success btn-rigth pull-right waves-effect waves-light" onclick="pageExtractionsSearch1();">Pesquisar</button>
									</div>
								</div>

								<div class="col-md-2 col-xs-2">
									<button type="button" class="btn btn-success btn-rigth pull-right" onclick="pageExtractionsSearch();">Pesquisar ajax</button>
								</div>

							</div>
						</td>

						<td id="scmlDividerExpandCollapse" class="well" style="height: 208px;">
							<div id="searchMenuExpandCollapse" onclick="toggleScmlSearchMenu();" style="height: 146px;">
								<span class="glyphicon glyphicon-search"></span>
								<p>Pesquisa</p>
								<div id="searchMenuExpandCollapsePlaceHolder" style="height: 70px;"></div>
								<span id="searchMenuExpandCollapseArrow" class="glyphicon glyphicon-menu-left"></span>
							</div>
						</td>

						<td>
							<div>
								<c:if test="${showListaUsers == true}">
									<c:import url="/html/views/commonx/listaUsers.jsp"></c:import>
								</c:if>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

	<%-- ---------------------------------- Generic Modal Container ---------------------------------- --%>
	<%-- Area reservada para MODAL de criação e edição de elementos --%>
	<div id="modal-container"></div>

	<%-- ---------------------------------- footer ---------------------------------- --%>
	<div id="common-footer">
		<jsp:include page="/html/views/commonx/pageFooter.jsp" />
	</div>




	<script type="text/javascript">
		$(document).ready(function() {
			contentResize();
		});
	</script>

	<script type="text/javascript">
		function pageExtractionsSearch() {
			console.log("pageExtractionsSearch");
			callController();
		}

		function pageExtractionsSearch1() {
			console.log("pageExtractionsSearch");
			callController1();
		}
	</script>

	<script type="text/javascript">
		/**
		 * Checkboxes listeners
		 */
		$('#profiles-table thead input[type=checkbox]').on('click',
				(function() {

					clickChecbox("#profiles-table thead input[type=checkbox]");

				}));

		$('#profiles-table tbody input[type=checkbox]').on('click',
				(function() {

					clickChecbox($(this));

				}));
	</script>

</body>
</html>



