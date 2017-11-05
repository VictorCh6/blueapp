<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
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
        <header id="header">
            <tiles:insertAttribute name="header" />
        </header>
     	<br>
        <section id="menu">
            <tiles:insertAttribute name="menu" />
        </section>
        <br><br>
        <section id="site-content">
            <tiles:insertAttribute name="body" />
        </section>
        <br><br>
        <footer id="footer">
            <tiles:insertAttribute name="footer" />
        </footer>
</body>
</html>