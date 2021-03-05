<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>provide student information</h1>
<hr/>
<f:form modelAttribute="st" action="saveprocess">
<table border="1">
<f:hidden path="id"/>
<tr>
<td>name</td>
<td><f:input path="name"/></td>
</tr>
<tr>
<td>email</td>
<td><f:input path="email"/></td>
</tr>
<tr>
<td>date of birth</td>
<td><f:input path="dateofbirth"/></td>
</tr>
<tr>
<td>gender</td>
<td>
<f:radiobutton  path="gender" value ="Male"/>Male
<f:radiobutton  path="gender" value ="Female"/>Female


</td>
</tr>
<tr>
<td>hobbies</td>
<td>
<f:checkbox path="hobbies" value="cricket"/>Cricket<br/>
<f:checkbox path="hobbies" value="football"/>Football<br/>
<f:checkbox path="hobbies" value="volleyball"/>Volleyball<br/>
<f:checkbox path="hobbies" value="hockey"/>Hockey<br/>
</td>
</tr>
<tr>
<td>city</td>
<td>
<f:textarea path="city"/>
</td>
</tr>
<tr>
<td>address</td>
<td>
<f:textarea path="address"/>
</td>
</tr>


<td></td>
<td>
<input type="submit" value="submit">&nbsp;
<input type="reset" value="reset">
</td>


</table>

</f:form>
<a href="liststudents">click here for list of students</a>

</body>
</html>