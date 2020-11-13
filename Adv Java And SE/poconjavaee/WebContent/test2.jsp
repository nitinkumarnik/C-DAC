<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String str = request.getParameter("str");
String n = request.getParameter("num");
int num = Integer.parseInt(n);

for (int i=0; i<num; i++) {
%>
<p><%= str %></p>
<%
}
%>
</body>
</html>