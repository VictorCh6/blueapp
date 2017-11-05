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
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${contracts}" var="contract">
					<tr>
						<td>${contract.number}</td>
						<td>${contract.system}</td>
						<td>${contract.startDate}</td>
						<td>${contract.endDate}</td>
						<td>${contract.value} zł</td>
						<td>${contract.period}</td>
						<td>${contract.isActive}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>