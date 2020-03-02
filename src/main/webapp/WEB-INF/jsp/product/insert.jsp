<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New Product</title>
</head>
<body>
<header>
    <h1>Product Entry</h1>
</header>

<main>
    <form:form action="save" method="post" modelAttribute="product">
        Name: <form:input path="name"/>
        <input type="submit" value="save">
    </form:form>

    <a href="${pageContext.request.contextPath}/product/list">Cancel</a>
</main>

<footer>

</footer>
</body>
</html>
