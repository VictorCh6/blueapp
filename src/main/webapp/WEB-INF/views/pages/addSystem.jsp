<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>

<section class="container text-center">
	<form:form action="addSystem" method="post" modelAttribute="system" class="form-horizontal">
		<fieldset>
			<legend>Dodaj system</legend>
			<div class=form-group>
				<label>Nazwa</label>
				<div>
					<form:input path="name" />
					<form:errors path="name" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Opis</label>
				<div>
					<form:textarea path="description" />
					<form:errors path="description" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Technologie</label>
				<div>
					<form:textarea path="technologies" />
					<form:errors path="technologies" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<label>Klient</label>
				<div>
					<form:input path="owner" />
					<form:errors path="owner" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<input type="submit" id="btnAdd" class="btn btn-primary" value ="Dodaj"/>
			</div>
		</fieldset>
	</form:form>
</section>