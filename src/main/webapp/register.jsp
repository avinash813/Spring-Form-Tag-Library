<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Application</title>
</head>
<body>
   <h1 style=' color: red; text-align:center'>Registration Application</h1>
   		<div style = "display :flex; justify-content:center">
         <form:form method="post" action = "details" modelAttribute="empl" >
            <table>
                  <tr>
                  <th> ID</th>
                  <td> <form:input path="id"/></td>
                  </tr>
                  
                   <tr>
                  <th> Name</th>
                  <td> <form:input path="iname"/></td>
                  </tr>
                  
                  <tr>
                  <th> City</th>
                  <td> <form:input path="icity"/></td>
                  </tr>
                  
                   <tr>
                  <th>Salary</th>
                  <td> <form:input path="isalary"/></td>
                  </tr>
                  
                   <tr>
                 
                  <td> <input type="submit" value="Register"></td>
                  </tr>
            
            
            </table>
         
         </form:form>
         
   </div>
</body>
</html>