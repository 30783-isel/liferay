<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resources/x3la/css/menu/menu.css" rel="stylesheet">

<script src="/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/resorces/x3la/javascript/menu.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>

<%-- ---------------------------------- header ---------------------------------- --%>
<div id="common-header">
	<jsp:include page="/html/views/commonx/pageHeader.jsp" />
</div>
	
<form action="home" method="post">
<input type="text" name="userName"><br>
<input type="submit" value="Login">
</form>

<%-- ---------------------------------- header ---------------------------------- --%>
<div id="common-header">
	<jsp:include page="/html/views/commonx/pageFooter.jsp" />
</div>
	
</body>
</html>