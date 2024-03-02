
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Your Page Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
 <%@ include file="Navigation.jspf" %>
    <div class="container">
   
   <form:form method="post" modelAttribute="todo">
    <b>Description:</b> <form:input type="text" path="description" required="required" />                                     
      <%-- <form:errors  path="description"/>  --%> 
      
     <form:input type="hidden" path ="id"/>
     <form:input type="hidden" path ="done"/>
     
    <input type="submit" class="btn btn-success" />
            
   </form:form>
   
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </div>
    
</body>
</html>
