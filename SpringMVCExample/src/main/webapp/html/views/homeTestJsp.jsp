<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>
<html>
<head>

<link  href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/css/menu.css" rel="stylesheet">
<link  href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/javascript/menu.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-1.11.3.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-ui.min.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/auxiliares.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/js/bootstrap.min.js"></script>


<title>Home</title>
</head>
<body>
	<%-- ---------------------------------- header ---------------------------------- --%>
	<div id="common-header">
		<jsp:include page="/html/views/commonx/pageHeader.jsp" />
	</div>
	<div id="content" class="content scmlContent passiveLotteryContent">
		<h1>Server!</h1>

		<P>The time on the server is ${serverTime}.</P>

		<div class="col-md-2 col-xs-2">
			<button type="button" class="btn btn-success btn-rigth pull-right"
				onclick="pageExtractionsSearch();">Pesquisar</button>
		</div>

		<c:forEach var="user" items="${users}">
			<table class="table table-striped">
				<tr>
					<td>${user.name}</td>
					<td>${user.username}</td>
					<td>${user.email}</td>
					<td>${user.address.street}</td>
					<td>${user.address.city}</td>
					<td>${user.address.suite}</td>
					<td>${user.phone}</td>
					<td>${user.website}</td>
					<td>${user.company.name}</td>
					<td>${user.company.catchPhrase}</td>
				</tr>
			</table>

		</c:forEach>

		<div id="extraction-container-message" style="height: 30px;">
			<c:if test="${not empty serverMessage}">
				<div id="common-header">
					<jsp:include page="/html/views/commonx/pageMessage.jsp" />
				</div>
			</c:if>
		</div>

	</div>
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
