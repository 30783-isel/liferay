<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<script src="/common/javascript/jquery/jquery-1.11.3.js"></script>
		<script>
			$(document).ready(function(){
				window.location.replace('${empty url ? "/login": url}');
			});
		</script>
	</head>

	<body>
	</body>
</html>