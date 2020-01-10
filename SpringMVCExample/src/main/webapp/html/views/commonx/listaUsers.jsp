<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="content-detail">

	<div id="detail-main">

		<div id="profiles-table" class="table-container">
			<div class="table-body dynamic-table-header">

				<table class="table">
					<thead class="theadT">
						<tr>
							<th><label class="checkbox-inline"><input type="checkbox"><span class="input-img"></span></label></th>
							<th>Id</th>
							<th class="roleCode">Name</th>
							<th>Email</th>
							<th>Username</th>
							<th class="roleDetail">Phone</th>
							<th>Detalhes</th>
						</tr>
					</thead>
				</table>



			</div>


			<div class="table-body dynamic-table">
				<table class="table">
					<tbody class="tbodyT">
						<c:forEach var="user" items="${users}">
							<tr>

								<td><input id="extractionId" name="extractionId" value="1424" type="hidden"> <label class="checkbox-inline"> <input type="checkbox" class="checkbox-selector"> <span class="input-img"></span>
								</label></td>
								<td>${user.id}</td>
								<td>${user.name}</td>
								<td>${user.email}</td>
								<td>${user.username}</td>
								<td>${user.phone}</td>
								<td class="roleDetail"><button class="btn btn-xs btn-info" onclick="showUserDetail('6')">Ver/Editar</button></td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>

		<div id="detail-footer">

			<form id="stateButtons" class="row stateButtons form-inline" onsubmit="return false;">

				<input type="hidden" id="selectedRoles" name="roleId" value="">

				<div class="form-group">
					<label class="disabled">Estado:</label>
					<div id="status" class="btn-group dropdown">
						<input type="hidden" name="roleStatus" data-initialval="" value="">
						<button type="button" class="disabled form-control btn btn-default dropdown-toggle" data-toggle="dropdown" style="width: 100px;">
							<span data-default="- - -">- - -</span> <span class="custom-caret"></span>
						</button>
						<ul class="dropdown-menu custom" role="menu" aria-labelledby="dropdownMenu">
							<li value="Y"><a href="#">Ativo</a></li>
							<li value="N"><a href="#">Suspenso</a></li>
						</ul>
					</div>
				</div>

				<div class="form-group pull-right">
					<button id="state_btn" disabled="disabled" type="button" class="btn btn-success" onclick="activateStateButtons(this)" style="width: 125px;">Alterar Estado</button>
					<button id="selec_btn" type="button" class="hidden btn btn-info" onclick="activateProfilesSelection(this)" style="width: 125px;">Nova seleção</button>
					<button id="save-btn" disabled="disabled" type="button" class="btn btn-success" onclick="saveSelected()">Gravar</button>
				</div>

			</form>

		</div>
	</div>
</div>

<%-- ---------------------------------- Generic Modal Container ---------------------------------- --%>
<%-- Area reservada para MODAL de criação e edição de elementos --%>
<div id="modal-container"></div>

<
<script type="text/javascript">
<!--
	//-->

	$('.table-body.dynamic-table .table .tbodyT button.btn-info').on(
			"click",
			function() {
				let userId = $(this).closest('tr').find("td:eq(1)").text();

				alert('Clicked value: ' + userId);

				var fURL = 'https://jsonplaceholder.typicode.com/users/'
						+ userId;

				ajaxRequestGet(fURL, $('#modal-container'), true);
			});

	function showUserDetail(userId) {

		alert('Clicked value: ' + userId);
	}
</script>
