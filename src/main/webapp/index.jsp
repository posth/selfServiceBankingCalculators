<%-- 
    Document   : index
    Created on : 1-Feb-2017, 6:51:44 PM
    Author     : Marc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Self-Service Banking</title>
        <link rel="stylesheet" href="styles/normalize.css" type="text/css">
        <link rel="stylesheet" href="styles/styles.css" type="text/css"/>
    </head>
    <body>
        <h1 class="headerTitle">Self Service Banking</h1>
        <form id="informationForm" action="AddUserDetails" method="post">
            <p>
                <label>Email:</label>
                <input type="email" name="email" value="${user.email}" required>
            </p>
            <p>
                <label>First Name:</label>
                <input type="text" name="firstName" value="${user.firstName}" required>
            </p>
            <p>
                <label>Last Name:</label>
                <input type="text" name="lastName" value="${user.lastName}" required>
            </p>
            <p>
                <button type="submit" value="Join Now">Enter details</button>
            </p>
        </form>

        <form id="forwardingForm" action="calculator_choice.jsp" >
            <button>Continue without details:</button>
        </form>



    </body>
</html>
