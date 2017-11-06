<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>
<%@ include file="/WEB-INF/views/tiles/template/selectmenu.jsp" %>

<section class="container text-center">
	<form:form action="updateContract" method="post" modelAttribute="contract" class="form-horizontal">
		<fieldset>
			<legend>Edytuj kontrakt</legend>
			<div class=form-group>
				<label>Numer</label>
				<div>
					<form:input path="number" />
					<form:errors path="number" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>System</label>
				<div>
					<form:select path="system" id="systemSelect">
						<c:forEach items="${systems}" var="system">
							<option>${system.name}</option>
						</c:forEach>
					</form:select>
					<form:errors path="system" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Data od</label>
				<div>
					<form:input path="startDate" placeholder="YYYY/MM/DD"/>
					<form:errors path="startDate" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Data do</label>
				<div>
					<form:input path="endDate" placeholder="YYYY/MM/DD"/>
					<form:errors path="endDate" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Wartość</label>
				<div>
					<form:input path="value" />
					<form:errors path="value" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Okres</label>
				<div>
					<form:select path="period" id="period">
						<option value ="MONTH">Miesiąc</option>
						<option value ="QUARTER">Kwartał</option>
						<option value ="YEAR">Rok</option>
					</form:select>
					<form:errors path="period" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Aktywna</label>
				<div>
					<form:radiobutton path="isActive" value="true" />TAK
							
					<form:radiobutton path="isActive" value="false" />NIE
					
				</div>
			</div>
			<div class=form-group>
				<input type="submit" id="btnAdd" class="btn btn-primary" value ="Dokonaj edycji"/>
			</div>
		</fieldset>
	</form:form>
</section>