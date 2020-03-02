<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<header>
    <h1>Home Page</h1>
</header>

<main>
    <a href="login">Show login form</a><br/>

    <a href="${pageContext.request.contextPath}/product/entry">Add new product</a><br/>
    <a href="${pageContext.request.contextPath}/product/list">Show product list</a><br/>
</main>

<footer>

</footer>

</body>
</html>
