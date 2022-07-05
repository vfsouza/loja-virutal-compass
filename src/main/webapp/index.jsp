<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <h1>
            <%= "Product checkout" %>
        </h1>
        <br/>
        <form action="registration" target="_blank">
            <label for="name">Username</label>
            <input type="text" name="name" id="name">
            <label for="password">Password</label>
            <input type="text" name="password" id="password">
            <br/>
            <label for="street">Street</label>
            <input type="text" name="street" id="street">
            <label for="number">Number</label>
            <input type="text" name="number" id="number">
            <label for="city">City</label>
            <input type="text" name="city" id="city">
            <label for="state">State</label>
            <input type="text" name="state" id="state">
            <br/>
            <label for="price">Price</label>
            <input type="text" name="price" id="price">
            <label for="productId">Product ID</label>
            <input type="text" name="productId" id="productId">
            <label for="postalCode">Delivery state</label>
            <input type="text" name="postalCode" id="postalCode">
            <br/>
            <input type="submit" name="action" value="JSON">
            <input type="submit" name="action" value="JSP">
        </form>
    </body>
</html>