<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of  students</h1>
<p>
<button onclick="window.location.href='addstudent'"; return false;>AddStudent</button>
</p>
<table  border="1">
<tr>
<th>name</th>
<th>email</th>
<th>dateofbirth</th>
<th>gender</th>
<th>hobbies</th>
<th>city</th>
<th>address</th>
<th>Action</th>
</tr>
<c:forEach items="${stdlst}" var="student">
<c:url var="updatelink" value="updateform">
<c:param name="studentId" value="${student.id}"/>

</c:url>
<c:url var="deletelink" value="deleteform">
<c:param name="studentId" value="${student.id}"/>

</c:url>
<tr>
<td>${student.name}</td>
<td>${student.email}</td>
<td>${student.dateofbirth}</td>
<td>${student.gender}</td>
<td>${student.hobbies}</td>
<td>${student.city}</td>
<td>${student.address}</td>
<td><a href="${updatelink}">Update </a>| <a href="${deletelink}">Delete</a>
</td>
</tr>
</c:forEach>

</table>

</body>
</html>