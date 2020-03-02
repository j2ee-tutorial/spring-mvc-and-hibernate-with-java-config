<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Project Index</h1>

<a href="<%=request.getContextPath()%>/product">Product</a><p>(entry page using absolute address)</p>
<br/>
<a href="product">Product</a><p>(entry page using relative address)</p>

<p>Welcome to Spring MVC Tutorial ...</p>
<a href="welcome.html">Click here to see welcome message form a Spring MVC controller</a>

</body>
</html>
