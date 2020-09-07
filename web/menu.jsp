<%--
  Created by IntelliJ IDEA.
  User: hsenid
  Date: 2020-09-07
  Time: 10.47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu | Test Bank</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-dark bg-primary">
    <span class="navbar-brand mb-0 h1">Test Bank</span>
</nav>
    <br />

    <div class="container">
        <ul class="list-group">
            <li class="list-group-item active"> Hi, ${param.username}</li>
            <li class="list-group-item">Your Account No : ${param.accountNo}</li>
            <li class="list-group-item">Your Account Type : ${param.accountType}</li>
        </ul>
        <br/>
        <h1>What do you want to do ?</h1>
        <ul class="list-group list-group-horizontal-sm">
            <li class="list-group-item">
                <form action="CheckBalanceServlet" method="GET">
                    <input type="hidden" name="balance" value=${param.balance}>
                    <input class="btn btn-primary" type="submit" value="Check Balance">
                </form>
            </li>
            <li class="list-group-item">
                <form action="DepositServlet" method="GET">
                    <input type="hidden" name="balance" value=${param.balance}>
                    <input type="number" class="form-control" placeholder="Enter Amount" name="depositAmount" required>
                    <br/>
                    <input class="btn btn-primary" type="submit" value="Deposit Money">

                </form>
            </li>
            <li class="list-group-item">
                <form action="WithdrawServlet" method="GET">
                    <input type="hidden" name="balance" value=${param.balance}>
                    <input type="number" class="form-control" placeholder="Enter Amount" name="withdrawAmount" required>
                    <br/>
                    <input class="btn btn-primary" type="submit" value="Withdraw Money">
                </form>
            </li>
        </ul>
    </div>



</body>
</html>
