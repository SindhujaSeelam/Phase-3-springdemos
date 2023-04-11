<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body style=" background-repeat: no-repeat; background-size: cover;"background="">
<form action="sppurchase">
Category :
<select style="width:165px;height:23px" name="category" required>
<option></option>
<option value="Sneakers">Sneakers</option>
<option value="Formals">Formals</option>
<option value="Sport">Sport</option>
<option value="Loafers">Loafers</option>
</select>
Date:<input name="date"type="text"/>
<input type="submit" value="categorize"/><br>
${msg}<br>
<c:if test="${values==true}"> 
<table>
<tr>
<th>User name</th>
<th>User email</th>
<th>Product Category</th>
<th>Product price</th>
<th>Date</th>
</tr>
<c:forEach items="${purchase}" var="purchase">
<tr>

<td>${purchase.name}<br>
<td>${purchase.email}</td>
<td>${purchase.category}</td><br>
<td>${purchase.price}</td><br>
<td>${purchase.date}</td><br>
</tr>
</c:forEach>
</table>
</c:if>
</form>
<a href="adminback" style="text-decoration: none"><b>Back</a>
</body>
</html>