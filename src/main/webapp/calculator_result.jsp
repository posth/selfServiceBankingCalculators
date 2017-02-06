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
        <h1>Loan Calculator result</h1>
        <p>${loan.monthlyPayment}</p>
        
        <h1>Future Value of Savings result</h1>
        <p>${futureValue.futureValue}</p>
    </body>
</html>
