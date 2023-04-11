<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
<br>
<br>
<center>
<c:forEach items="${products}" var="product" >
<form action="detailedproduct" method="post">
<input name="pid"type="hidden" value="${product.id}"/>
<input name="price"type="hidden" value="${product.price}"/>
<input name="uid"type="hidden" value="${uid}"/>
<p>${product.category}</p>
Price :${product.price}<br>
Color:${product.color}<br>
<input style="background: orange; border:none;border-radius: 15px;
    padding: 5px 20px;
    background: yellow;
    font-size: 1em;
    cursor: pointer;"type="submit" value="Book"/>
</form>
</c:forEach>
</center>
</body>
</html>