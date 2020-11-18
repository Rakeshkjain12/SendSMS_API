<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>

<form:form action="${contextRoot}/send" method="post" modelAttribute="sms">

<h1 align="center">Send Message API</h1>
<table align="center">
  
<form:hidden path="id"/>
<tr>
  <td>Enter Mobile Number</td>
  <td>  <form:input path="phoneNumber" /></td>
</tr>

<tr>
  <td>Enter Message</td>
  <td>  <form:textarea path="message" cols="50" rows="20" /></td>
</tr>
   <tr>
    <td colspan="2" align="right"> <button type="submit" value="Submit Message"> SEND</button></td>
   </tr>   
     
     
      
     
</table>      
</form:form>
</body>
</html>