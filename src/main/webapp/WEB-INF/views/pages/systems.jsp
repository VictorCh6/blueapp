<%@ include file="/WEB-INF/views/tiles/template/taglibs.jsp" %>

	
<section class="container">
	<c:forEach items="${systems}" var="system">
		<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
			<div class="thumbnail">
				<div class="caption">
		        Nazwa systemu:
					
					<h3 class="thumbnail text-center"> ${system.name}</h3>
					<p>Opis: ${system.description}</p>
					<p>Technologie: ${system.technologies}</p>
					<p>Klient: ${system.owner}</p>
				</div>
				<div class="text-center" style="padding-bottom: 10px">
					<a href="
						<c:url value='/updateSystem-${system.name}' />" class="btn btn-success custom-width">Edytuj
					</a>
					<a href="
						<c:url value='/deleteSystem-${system.name}' />" class="btn btn-danger custom-width">Usuń
					</a>
				</div>
			</div>
		</div>
	</c:forEach>
</section>
<div class="well text-center">
	<a href="
		<c:url value='/addSystem' />">Dodaj system
	</a>
</div>