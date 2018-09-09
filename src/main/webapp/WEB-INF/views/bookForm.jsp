<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>zadanie1</title>
</head>
<body>
	<form:form method="post" modelAttribute="book">
		Title:<form:input path="title"/><br>
		Rating:<form:input path="rating"/><br>
		Description:<form:input path="description"/><br>
		Publisher:<br>
		<form:select  path="publisher.id" items="${publishers}" itemValue="id" itemLabel="name"/><br>
		Kategoria:<br>
		<form:select  path="kategoria.id" items="${kategorie}" itemValue="id" itemLabel="name"/><br>
		<input type="submit" value="Submit">
	</form:form>
	${publishers}
</body>
</html>


