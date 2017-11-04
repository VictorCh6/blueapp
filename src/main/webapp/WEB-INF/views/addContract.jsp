<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Contracts</title>
	<link rel="stylesheet" href="http://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" />
	<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="http://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>

</head>

<body>
	<div class="jumbotron">
		<div class="container">
			<h1>Kontrakty</h1>
			<p>Dodaj kontrakt</p>
		</div>
	</div>
	<section class="container">
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
</body>

</html>