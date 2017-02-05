<%-- 
    Document   : calculator_choice
    Created on : 1-Feb-2017, 7:58:45 PM
    Author     : Marc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Financial Calculators</title>
    </head>
    <body>
        <p>Hi <span>${user.firstName}</span>,</p>
        <p>Choose one of the following calculators:</p>

        <!-- Form for the Loan Calculator -->
        <form id="loanCalculatorForm" action="LoanCalculator" method="post">
            <p>
                <label>Principal</label>
                <input type="number" name="principal" step="0.1" value="${loan.principal}" required>
            </p>
            <p>
                <label>Annual rate of interest</label>
                <input type="number" name="rateOfInterest" step="0.1" value="${loan.rateOfInterest}" required>
            </p>
            <p>
                <label>Term(months)</label>
                <input type="number" name="term" value="${loan.term}" required>
            </p>
            <p>
                <button type="submit" value="Calculate Monthly Payment">Calculate Monthly Loan Payment</button>
            </p>
        </form>
    </body>
</html>
