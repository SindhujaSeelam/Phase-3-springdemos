<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body style=" background-repeat: no-repeat; background-size: cover;"background="">
<center><table><form action="insertproduct">
<font size="10px">Category :
<select style="width:200px;height:35px" name="category" required>
<option></option>
<option value="Sneakers">Sneakers</option>
<option value="Formals">Formals</option>
<option value="Sport">Sport</option>
<option value="Loafers">Loafers</option>
</select><br>
Price :<input style="width:200px; height:35px" name="price"type="number" required/><br>
Brandname :<input style="width:200px; height:35px" name="brandname"type="text" required/><br>
Color :<input style="width:200px; height:35px" name="color"type="text" required/><br>
Material Type :<input style="width:200px; height:35px" name="mt"type="text" required/><br>
<input style="width:150px;height:50px" type="submit" value="Add product"/><br>
</form>
</table>
<a href="productslist" style="text-decoration: none">Back</a>
</center>
</body>
</html>