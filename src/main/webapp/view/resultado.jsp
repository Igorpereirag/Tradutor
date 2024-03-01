<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado da Tradução</title>
</head>
<body>
    <h1>Resultado da Tradução</h1>
    <p>A palavra traduzida é: <%= request.getAttribute("traducao") %></p>
</body>
</html>
