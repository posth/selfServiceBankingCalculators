<%-- 
    Document   : calculator_result
    Created on : 5-Feb-2017, 1:21:44 PM
    Author     : Marc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result of your calculation</title>
    </head>
    <body>
        <h4>The results of your calculator are:</h4>
        <p>${futureValue.futureValue}</p>
        <p>${savings.monthlyPayment}</p>
        <p>${loan.monthlyPayment}</p>
    </body>
</html>
