<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="arith1">First: </label>
            <input type="number" name="arith1" id="arith1" value="${arith1}">
            <br>
            <label for="arith2">Second: </label>
            <input type="number" name="arith2" id="arith2" value="${arith2}">
            <br>
            <button type="submit" name="submit" value="+">+</button>
            <button type="submit" name="submit" value="-">-</button>
            <button type="submit" name="submit" value="*">*</button>
            <button type="submit" name="submit" value="%">%</button>
            <br>
        </form>
        <p>Result: ${message}</p>
        <a href="/Calculator/age">Age Calculator</a>
    </body>
</html>
