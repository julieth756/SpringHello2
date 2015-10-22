<%-- 
    Document   : irRespuesta
    Created on : Oct 22, 2015, 2:42:05 PM
    Author     : Julieth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta</title>
    </head>
    <body>
        <form:form action="" method="get">
            <form:label path="num1">Numero 1</form:label>    
            <form:input path="num1" />
            <form:label path="num2">Numero 2</form:label> 
            <form:input path="num2" />
        <input type="submit" value="Operar">
        </form:form>
    </body>
</html>
