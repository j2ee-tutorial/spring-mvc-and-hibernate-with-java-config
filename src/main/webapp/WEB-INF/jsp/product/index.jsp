<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
    <style>
        table, th, td {
            padding: 10px;
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>

<header>
    <div>
        <a href="${pageContext.request.contextPath}/product/list?lang=en">En</a>
        <a href="${pageContext.request.contextPath}/product/list?lang=fa">Fa</a>
    </div>

    <h1><spring:message code="products"/> </h1>
</header>

<main>
    <%=request.getParameter("lang")%>
    ${message}

    <table>
        <thead>
        <tr>
            <td>Id</td>
            <td>Name</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href="${pageContext.request.contextPath}/product/entry">Add</a>

</main>

<footer>

</footer>

</body>
</html>
