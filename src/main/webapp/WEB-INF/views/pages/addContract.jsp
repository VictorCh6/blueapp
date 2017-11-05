<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>
	<section class="container text-center">
		<form:form action="addContract" method="post" modelAttribute="contract" class="form-horizontal">
			<fieldset>
				<legend>Dodaj kontrakt</legend>
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
						<form:input path="system" />
						<form:errors path="system" cssClass="error" />
					</div>
				</div>				
				<div class=form-group>
					<label>Data od</label>
					<div>
						<form:input path="startDate" />
							<form:errors path="startDate" cssClass="error" />
					</div>
				</div>				
				<div class=form-group>
					<label>Data do</label>
					<div>
							<form:input path="endDate" />
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
							<form:input path="period" />
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
					<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
				</div>
			</fieldset>
		</form:form>

	</section>