<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="phase5assignment1.Circle"></jsp:useBean>
<jsp:setProperty property="radius" name="obj" value="23"/>
<h1><jsp:getProperty property="radius" name="obj"/></h1>
</body>
</html>