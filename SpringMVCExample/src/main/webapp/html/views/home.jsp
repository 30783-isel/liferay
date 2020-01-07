<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>
<html>
<head>

<link
	href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/css/menu.css"
	rel="stylesheet">
<script
	src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/javascript/menu.js"></script>

<script
	src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-1.11.3.js"></script>
<script
	src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-ui.min.js"></script>
<script
	src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/auxiliares.js"></script>

<link
	href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/js/bootstrap.min.js"></script>


<title>Home</title>
</head>
<body>
	<%-- ---------------------------------- header ---------------------------------- --%>
	<div id="common-header">
		<jsp:include page="/html/views/commonx/pageHeader.jsp" />
	</div>
	<h1>Server!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<div class="col-md-2 col-xs-2">
		<button type="button" class="btn btn-success btn-rigth pull-right"
			onclick="pageExtractionsSearch();">Pesquisar</button>
	</div>

	<c:forEach var="i" begin="1" end="10">
		<td>${i}</td>
	</c:forEach>

	<div id="extraction-container-message" style="height: 30px;">
		<span>"${serverMessage}"
		</span> <span>${userName}</span>
		<c:if test="${not empty serverMessage}">

			<div id="common-header">
				<jsp:include page="/html/views/commonx/pageMessage.jsp" />
			</div>
		</c:if>
	</div>
	
	<h3>Hi ${userName}</h3>


	<%-- ---------------------------------- header ---------------------------------- --%>
	<div id="common-header">
		<jsp:include page="/html/views/commonx/pageFooter.jsp" />
	</div>
</body>
</html>


<script type="text/javascript">
	function pageExtractionsSearch() {
		console.log("pageExtractionsSearch");
		callController();
	}
</script>
