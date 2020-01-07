<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link  href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/css/menu.css" rel="stylesheet">
<link  href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/javascript/menu.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-1.11.3.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/jquery/jquery-ui.min.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/javascript/auxiliares.js"></script>
<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/bootstrap/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>

<%-- ---------------------------------- header ---------------------------------- --%>
<div id="common-header">
	<jsp:include page="/html/views/commonx/pageHeader.jsp" />
</div>

<h3>Hi ${userName}</h3>

<%-- ---------------------------------- header ---------------------------------- --%>
<div id="common-header">
	<jsp:include page="/html/views/commonx/pageFooter.jsp" />
</div>
	
</body>
</html>