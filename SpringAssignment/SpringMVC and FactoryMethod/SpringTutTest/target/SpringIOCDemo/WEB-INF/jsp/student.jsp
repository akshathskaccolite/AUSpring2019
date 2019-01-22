<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC</title>
</head>

<body>
	<center>
		<h2>LOGIN PAGE</h2>
	</center>
	<center>
		<form method="POST" action="/SpringTutTest/addStudent" name="student"
			modelAttribute="student">
			<table>
				<tr>
					<td><form:label path="name">STUDENT NAME</form:label></td>
					<td><input name="studentName" /></td>
				</tr>
				<tr>
					<td><form:label path="id">STUDENT ID</form:label></td>
					<td><input name="studentId" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>

</html>