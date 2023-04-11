<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Detailed Information of the product</h1>
<form action="payment">
<input name="pid"type="hidden" value="${pid}"/>
<input name="price"type="hidden" value="${price}"/>
<input name="uid"type="hidden" value="${uid}"/>
<font size="15px">
<b>Category</b>:${sp.category}<br>
<b>Brandname</b>:${sp.brandname}<br>
<b>Price</b> :${sp.price}<br>
<b>Color</b>:${sp.color}<br>
<b>Material Type</b> :${sp.materialtype}<br>
<input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
  width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="submit" value="proceed to payment"/>
</form>
</body>
</html>