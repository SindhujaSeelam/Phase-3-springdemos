<%@ page language="java" contentType="text/html" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body style="    background-repeat: no-repeat; background-size: cover;" background="https://c0.wallpaperflare.com/preview/186/124/897/red-and-white-air-jordan-1-shoe-on-concrete-floor.jpg">
<center><h1><font style="color:red">Welcome to Admin Page</font></h1>
<input type="hidden" value="${username}"/>
<input type="hidden" value="${password}"/>
<br>
<a href="changepassword"><input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
    width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="button" value="Password reset"/></a><br>
  <a href="productslist"><input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
  width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="button" value="Products management"/></a><br>
<a href="userslist"><input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
  width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="button" value="Userlist"/></a><br>
  <a href="purchase"><input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
  width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="button" value="Purchase Report"/></a><br>
<a href="admin"><input style="background:darkblue;border-radius: 5px; background-color: #4CAF50; /* Green */
    width:250px;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer" type="button" value="Logout"/></a></center>
</body>
</html>