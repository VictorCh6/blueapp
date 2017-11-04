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
</body>

</html>