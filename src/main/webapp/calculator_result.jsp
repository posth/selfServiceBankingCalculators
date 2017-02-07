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

    <c:if ${futureValue.futureValue}>
        <p>Future Value of Savings result: ${futureValue.futureValue}</p>
    </c:if>

    <c:if ${savings.monthlyPayment}>
        <p>Savings per month needed: ${savings.monthlyPayment}</p>
    </c:if>

    <c:if ${loan.monthlyPayment}>
        <p>Loan Calculator result: ${loan.monthlyPayment}</p>
    </c:if>
</body>
</html>
