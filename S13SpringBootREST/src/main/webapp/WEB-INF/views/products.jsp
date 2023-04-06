<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="products" method="post">
<pre>
Name:<input type="text" name="name"/>
Description :<input type="text" name="description"/>
price:<input type="number" name="price"/>
<input type="submit" value="insert"/>
</pre>
</form>
<p>${message}</p>
<ul>
<c:forEach items="${products}" var="product">
<li>${product.name}|${product.description}|${product.price} </li>
</c:forEach>
</ul>
</body>
</html>