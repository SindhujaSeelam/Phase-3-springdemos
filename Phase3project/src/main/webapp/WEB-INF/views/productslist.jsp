<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body style=" background-repeat: no-repeat; background-size: cover;"background="">
<form action="searchuser">
<a href="addproduct"><input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
  width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="button" value="Add product"/></a><br>
<table>
<tr>
<h1>Product Details</h1>
<th>Product Category</th>
<th>Product Brandname</th>
<th>Product price</th>
<th>Product Color</th>
<th>Product Material Type</th>
</tr>
<c:forEach items="${products}" var="product">
<tr>
<td>${product.category}<br>
<td>${product.brandname}<br>
<td>${product.price}<br>
<td>${product.color}<br>
<td>${product.materialtype}<br>
</tr>
</c:forEach>
</table>
</form>
<a href="adminback" style="text-decoration: none"><b>Back</a>
</body>
</html>