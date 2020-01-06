<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<jsp:useBean id="constants"
	class="com.journaldev.spring.constants.Constants" />

<div class="table-container">
	<p>..........................................................................................................................................</p>
	<table class="table">
		<tbody>
			<tr class="passiveLotteryRow">
				<td colspan="7">
					<div id="modal-upper-msg" class="modal-inner-msg">
						<div id="messageTypeId" data-messageType="${messageType}">
							<div class="pull-right">
								<div id="message" class="media-body media-middle text-right">
									<span class="${messageType}">${serverMessage}</span>
								</div>
								<div id="image" class="media-right media-middle">
									<c:choose>
										<c:when test="${messageType == constants.MSG_TYPE_ERROR}">
											<img class="media-object media-object-style"
												src="/common/images/icon-msg_erro.png" alt="Erro" />
										</c:when>
										<c:when test="${messageType == constants.MSG_TYPE_SUCCESS}">
											<img class="media-object media-object-style"
												src="/common/images/icon-msg_sucesso.png" alt="Sucesso" />
										</c:when>
										<c:when test="${messageType == constants.MSG_TYPE_WARNING}">
											<img class="media-object media-object-style"
												src="/common/images/icon-msg_alerta.png" alt="Aviso" />
										</c:when>
									</c:choose>
								</div>
							</div>
						</div>
					</div>
				</td>
			</tr>
		</tbody>
	</table>
	<p>..........................................................................................................................................</p>
</div>