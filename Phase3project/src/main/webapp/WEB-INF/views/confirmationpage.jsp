<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Payment successful!!!!!!</h1>
<input name="pid"type="hidden" value="${pid}"/>
<input name="price"type="hidden" value="${price}"/>
<input name="uid"type="hidden" value="${uid}"/>
<b>User name</b> : ${user.name}<br>
<b>User email</b> :${user.email}<br>
<b>Product Category :</b>${product.category}<br>
<b>Product Brandname :</b>${product.brandname}<br>
<b>Product Price :</b>${product.price}<br>
<b>Product Color :</b>${product.color}<br>
<b>Product Material Type :</b>${product.materialtype}<br>

<form action="searchmore">
<br><br><input name="uid"type="hidden" value="${uid}"/>

<input type="submit" value="Search more products"/>
</form>
<br><a href="home" style="text-decoration: none"><b>Logout</a>
</body>
</html>