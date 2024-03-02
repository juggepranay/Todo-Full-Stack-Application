
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Your Page Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
 <%@ include file="Navigation.jspf" %>
    <div class="container">
    <h1>Welcome ${name} </h1>
   <hr>
    <table class ="table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Done</th>
                <th>Delete_Todo</th>
            </tr>
        </thead>
        <tbody>

            <c:forEach var="todo" items="${todos}">
    <tr>
        <td><c:out value="${todo.id}" /></td>
        <td><c:out value="${todo.description}" /></td>
        <td><c:out value="${todo.targetDate}" /></td>
        <td><c:out value="${todo.done}" /></td>
        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning" >Delete </a>
        <td><a href="update-todo?id=${todo.id}" class="btn btn-success" >update </a>
    </tr>
</c:forEach>
            
         
        </tbody>
    </table>
    <a href="add-todo" class ="btn btn-success" >AddNewTodo</a>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </div>
    
</body>
</html>
