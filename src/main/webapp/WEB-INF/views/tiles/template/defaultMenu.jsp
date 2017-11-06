<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>

<div class="row">
	<div class="col-6 col-sm-3 text-center">
		<a href="<spring:url value="/activeContracts" />" class="btn btn-lg">Aktywne umowy</a>	
	</div>
	<div class="col-6 col-sm-3 text-center">
		<a href="<spring:url value="/" />" class="btn btn-lg">Wszystkie umowy</a>	
	</div>
	<div class="col-6 col-sm-3 text-center">
		<a href="<spring:url value="/systems" />" class="btn btn-lg">Systemy</a>	
	</div>
	<div class="col-6 col-sm-3 text-center">
		<a href="<spring:url value="/about" />" class="btn btn-lg">O Aplikacji</a>	
	</div>
</div>