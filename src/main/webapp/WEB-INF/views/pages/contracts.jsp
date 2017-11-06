<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>

	
<section class="container">
	<table id="example" class="display" style="padding-bottom: 15px">
		<thead>
			<tr>
				<th>Numer</th>
				<th>System</th>
				<th>Od</th>
				<th>Do</th>
				<th>Wpływy</th>
				<th>W skali</th>
				<th>Aktywna</th>
				<th width="100"></th>
				<th width="100"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${contracts}" var="contract">
				<tr>
					<td>${contract.number}</td>
					<td>${contract.system.name}</td>
					<td>${contract.startDate}</td>
					<td>${contract.endDate}</td>
					<td>${contract.value } zł</td>
					<td>
						<c:choose>
							<c:when test = "${contract.period == 'MONTH'}">
								Miesiąc
							</c:when>
							<c:when test="${contract.period == 'QUARTER'}">
								Kwartał
							</c:when>
							<c:when test = "${contract.period == 'YEAR'}">
								Rok
							</c:when>
						</c:choose>
					</td>
					<td>
						<c:choose>
							<c:when test = "${contract.isActive == true}">
								TAK
							</c:when>
							<c:otherwise>
								NIE
							</c:otherwise>
						</c:choose>
					</td>
					<td>
						<a href="
							<c:url value='/updateContract-${contract.number}' />" class="btn btn-success custom-width">Edytuj
						</a>
					</td>
					<td>
						<a href="
							<c:url value='/delactivateContract-${contract.number}' />" class="btn btn-danger custom-width">Dezaktywuj
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
		<div class="well">
			<a href="
				<c:url value='/addContract' />">Dodaj nową umowę
			</a>
		</div>
	</section>
