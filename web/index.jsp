<%--
  Created by IntelliJ IDEA.
  User: hsenid
  Date: 2020-09-07
  Time: 08.58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome to Test Bank</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  </head>
  <body>

  <!-- Navigation Bar -->
  <nav class="navbar navbar-dark bg-primary">
    <span class="navbar-brand mb-0 h1">Test Bank</span>
  </nav>
  <div class="container text-center">
    <br />
    <h2>Enter Your Details</h2>


    <form action="BankAccountControllerServlet" method="GET">

<%--      Name--%>
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Enter Name" name="username" required>
      </div>

<%--      Accoount No--%>
      <div class="form-group">
        <input type="number" class="form-control" placeholder="Enter Account Number" name="accountNo" required>
      </div>

<%--      Account Type--%>
    <div class="text-left">
        <label>Account Type : </label>
    </div>

    <div class="form-check text-left">
        <input class="form-check-input" type="radio" name="accountType" value="Savings Account" checked>
        <label class="form-check-label" >
            Savings Account
        </label>
    </div>
    <div class="form-check text-left">
        <input class="form-check-input" type="radio" name="accountType" value="Checking Account">
        <label class="form-check-label" >
            Checking account
        </label>
    </div>
    <div class="form-check text-left">
        <input class="form-check-input" type="radio" name="accountType" value="Money Market Account">
        <label class="form-check-label" >
            Money market account
        </label>
    </div>
    <div class="form-check text-left">
        <input class="form-check-input" type="radio" name="accountType" value="Individual retirement account">
        <label class="form-check-label" >
            Individual retirement account
        </label>
    </div>


    <br />
    <%--      Initial Balance --%>
    <div class="form-group">
        <input type="number" class="form-control" placeholder="Enter Initial Balance" name="balance" required>
    </div>

      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
  </body>
</html>
