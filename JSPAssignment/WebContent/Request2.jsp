<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request JSP</title>
</head>
<body bgcolor="red">
<center><h1>ABOUT PAGE</h1>
<h2>WELCOME TO THE ABOUT PAGE</h2></center>
<br/>
<a href="http://localhost:8081/JSPAssignment/RequestDemo.jsp">BACK TO LOGIN PAGE</a>
<br/>
<br/>
<%
	out.println("User Name");
	out.println(request.getParameter("name1"));
	out.println(":");
	String s=request.getParameter("name1");
	try{
		session.setAttribute(s,(int)session.getAttribute(s)+1);
	}catch(Exception e){
		session.setAttribute(s,1);
	}
	
	out.println(session.getAttribute(request.getParameter("name1")));
	out.println(" ");
	out.println("TOTAL COUNT OF USERS VISITS :");
	out.println(session.getAttribute("totalcount"));
%>
</body>
</html>