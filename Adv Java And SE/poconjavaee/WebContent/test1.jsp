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
String s = request.getParameter("v1");
int vowCount = 0;
for (char ch : s.toLowerCase().toCharArray()) {
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		vowCount++;
}
%>
<h2>No. of vowels: <%= vowCount %></h2>
</body>
</html>