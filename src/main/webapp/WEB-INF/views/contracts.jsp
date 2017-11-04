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
	<script>
		$(document).ready(function() {
			$('#example').DataTable();
		});
	</script>

</head>

<body>
	<div class="jumbotron">
		<div class="container">
			<h1>Kontrakty</h1>
			<p>Wszystkie kontrakty</p>
		</div>
	</div>
	<section class="container">
		<table id="example" class="display" style="padding-bottom: 15px">
			<thead>
				<tr>
					<th>ID</th>
					<th>Numer</th>
					<th>System</th>
					<th>Data od:</th>
					<th>Data do</th>
					<th>Wartość</th>
					<th>Okres</th>
					<th>Aktywna</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${contracts}" var="contract">
					<tr>
						<td>${contract.id}</td>
						<td>${contract.number}</td>
						<td>${contract.system}</td>
						<td>${contract.startDate}</td>
						<td>${contract.endDate}</td>
						<td>${contract.value} zł</td>
						<td>${contract.period}</td>
						<td>${contract.isActive}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>

</html>