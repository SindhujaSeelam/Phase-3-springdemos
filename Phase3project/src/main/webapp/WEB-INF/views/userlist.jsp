<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body style=" background-repeat: no-repeat; background-size: cover;"background="">
<form action="searchuser">
Search :<input name="suser"type="text"/><input type="submit" value="search"/><br>
<c:if test="${values==true}"> 
<table>
<tr>
<th>User name</th>
<th>User email</th>
</tr>
<c:forEach items="${users}" var="user">
<tr>
<td>${user.name}<br>
<td>${user.email}<br>
</tr>
</c:forEach>
</table>
</c:if>
</form>
${msg}
<br><a href="adminback" style="text-decoration: none">Back</a>
</body>
</html>