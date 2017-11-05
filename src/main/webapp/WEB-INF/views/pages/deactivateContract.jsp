<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>
	<section class="container">
		<fieldset>
			<legend>System Input From</legend>
			<form:form action="addContract" method="post" modelAttribute="contract" class="form-horizontal">
				<table>
					<tr>
						<th>Numer</th>
						<td>
							<form:input path="number" />
							<form:errors path="number" cssClass="error" />
						</td>
						<th>System</th>
						<td>
							<form:input path="system" />
							<form:errors path="system" cssClass="error" />
						</td>
						<th>Data od</th>
						<td>
							<form:input path="startDate" />
							<form:errors path="startDate" cssClass="error" />
						</td>
						<th>Data do</th>
						<td>
							<form:input path="endDate" />
							<form:errors path="endDate" cssClass="error" />
						</td>
						<th>Wartość</th>
						<td>
							<form:input path="value" />
							<form:errors path="value" cssClass="error" />
						</td>
						<th>Okres</th>
						<td>
							<form:input path="period" />
							<form:errors path="period" cssClass="error" />
						</td>
						<th>Aktywna</th>
						<td>
							<form:radiobutton path="isActive" value="true" />TAK
							<form:radiobutton path="isActive" value="false" />NIE
						</td>
						<td>
							<button type="submit">Submit</button>
						</td>
					</tr>
				</table>
			</form:form>
		</fieldset>
	</section>