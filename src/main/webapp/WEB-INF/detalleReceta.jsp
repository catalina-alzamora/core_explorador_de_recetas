<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="/css/estilos.css">
    <meta charset="UTF-8">
    <title>Detalle de Receta</title>
</head>
<body>
    <h1>Detalle de la Receta</h1>
    <c:if test="${empty mensaje}">
        <h2>${nombre}</h2>
        <ul>
            <c:forEach var="i" items="${ingredientes}">
                <li>${i}</li>
            </c:forEach>
        </ul>      
    </c:if>

    <c:if test="${not empty mensaje}">
        <p>${mensaje}</p>
    </c:if>
    <a href="/recetas">Volver a la lista</a>

</body>
</html>
