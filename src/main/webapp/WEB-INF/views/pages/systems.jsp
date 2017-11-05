<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>

	<section class="container">
		<table id="example" class="display" style="padding-bottom: 15px">
			<thead>
				<tr>
					<th>Nazwa</th>
					<th>Opis</th>
					<th>Technologie</th>
					<th>Klient</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${systems}" var="system">
					<tr>
						<td>${system.name}</td>
						<td>${system.description}</td>
						<td>${system.technologies}</td>
						<td>${system.owner}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>