<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--
copied from
 
https://www.tutorialspoint.com/jsp/jsp_java_beans.htm#:~:text=JavaBeans%20Properties,the%20classes%20that%20you%20define.&text=S.No.&text=For%20example%2C%20if%20property%20name,()%20to%20read%20that%20property.
 -->

<jsp:useBean id="students" class="phase5assignment1.Student"></jsp:useBean>
<jsp:setProperty name = "students" property = "firstName" value = "Zara"/>
<jsp:setProperty name = "students" property = "lastName" value = "Ali"/>
<jsp:setProperty name = "students" property = "age" value = "10"/>
      

<p>Student First Name: 
	<jsp:getProperty name = "students" property = "firstName"/>
</p>
      
<p>Student Last Name: 
	<jsp:getProperty name = "students" property = "lastName"/>
</p>
      
<p>Student Age: 
	<jsp:getProperty name = "students" property = "age"/>
</p>

</body>
</html>