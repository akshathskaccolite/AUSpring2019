 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
		<%!
		static int c=0;
		int count=0;
		%>
	<form action="Request2.jsp" method="post">
	<center><H2>LOGIN PAGE</H2>
		<br/><br/>ENTER ID:<input type="text" name="name1"/>
		<br/>ENTER PASSWORD:<input type="password" name="pass1"/>
		<br/><br/><br/><input type="submit" value="submit"/></center>
			
		<%
		c=c+1;
		session.setAttribute("totalcount",c);
		%>
	</form>
</body>
</html>