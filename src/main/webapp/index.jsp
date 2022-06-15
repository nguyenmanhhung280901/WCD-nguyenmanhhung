<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<form action="home" method="post">
    name: <input type="text" name="name">
    price: <input type="text" name="price">
    brand: <input type="text" name="brand">
    description: <input type="text" name="description">
    <button type="submit">Save</button>
</form>
</body>
</html>