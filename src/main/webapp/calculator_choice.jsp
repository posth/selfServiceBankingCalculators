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
        <link rel="stylesheet" href="styles/normalize.css" type="text/css">
        <link rel="stylesheet" href="styles/styles.css" type="text/css"/>
    </head>
    <body>
        <div class="intro-paragraph">
            <p>Hi <span>${user.firstName}</span>,</p>
            <p>Choose one of the following calculators:</p>
        </div>
        <div class="form-wrapper">
            <!-- Form for the Loan Calculator -->
            <form id="loanCalculatorForm" action="LoanCalculator" method="post">
                <h3>Loan Calculator</h3>
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

            <!-- Form for the Future Value of Savings Calculator -->
            <form id="futureValueSavingsForm" action="FutureValueCalculator" method="post">
                <h3>Future Value of Savings</h3>
                <p>
                    <label>Payment Per Period - per month</label>
                    <input type="number" name="paymentPerPeriod" step="0.1" value="${futureValue.paymentPerPeriod}" required>
                </p>
                <p>
                    <label>Annual rate of interest on savings</label>
                    <input type="number" name="rateOfInterest" step="0.1" value="${futureValue.rateOfInterest}" required>
                </p>
                <p>
                    <label>Term(years)</label>
                    <input type="number" name="termInYears" value="${futureValue.termInYears}" required>
                </p>
                <p>
                    <button type="submit" value="Calculate Future Value of Savings">Calculate Future Value of Savings</button>
                </p>
            </form>

            <!-- Form for the Savings Calculator -->
            <form id="savingsForm" action="SavingsCalculator" method="post">
                <h3>Savings Goal</h3>
                <p>
                    <label>Target amount desired</label>
                    <input type="number" name="targetAmount" step="0.1" value="${savings.targetAmount}" required>
                </p>
                <p>
                    <label>Annual rate of interest expected</label>
                    <input type="number" name="rateOfInterest" step="0.1" value="${savings.rateOfInterest}" required>
                </p>
                <p>
                    <label>Length of time for savings (years)</label>
                    <input type="number" name="termInYears" value="${savings.termInYears}" required>
                </p>
                <p>
                    <button type="submit" value="Calculate Monthly amount to place aside">Calculate Monthly amount to place aside</button>
                </p>
            </form>
        </div>
    </body>
</html>
