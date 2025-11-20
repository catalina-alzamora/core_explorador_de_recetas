<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
    <meta charset="UTF-8">
    <title>Recetas</title>
</head>
<body>
    <h1>Lista de Recetas</h1>
    <ul>
        <c:forEach var="receta" items="${listaRecetas}">
            <li><a href="/recetas/${receta}">${receta}</a></li>
        </c:forEach>
    </ul>

</body>
</html>