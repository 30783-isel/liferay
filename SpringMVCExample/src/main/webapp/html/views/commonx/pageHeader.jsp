<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>
	<div class="dropdown">
		<button onclick="myFunction()" class="dropbtn">Menu</button>
		<div id="myDropdown" class="dropdown-content">
		
			<c:forEach var="item" items="${menu}"> 
				<a href="${item.link}">${item.name}</a>
			</c:forEach>

		</div>
	</div>
</div>