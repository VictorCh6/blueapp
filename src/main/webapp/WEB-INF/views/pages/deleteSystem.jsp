<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>

<section class="container text-center">
	<form:form action="deleteSystem" method="post" modelAttribute="system" class="form-horizontal">
		<fieldset>
			<legend>Usuń system</legend>
			<div class=form-group>
				<label>Nazwa</label>
				<div>
					<form:input path="name" />
					<form:errors path="name" cssClass="error" />
				</div>
			</div>
			<div class=form-group>
				<input type="submit" id="btnAdd" class="btn btn-primary" value ="Delete"/>
			</div>
		</fieldset>
	</form:form>
</section>