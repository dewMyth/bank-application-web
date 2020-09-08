package Controllers;

import Models.BankAccount;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DepositServletController")
public class DepositControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        deposit(request,response);
    }

    private void deposit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        double balance =  Double.parseDouble(request.getParameter("balance"));
        double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));
        double total;

        if(depositAmount > 0) {
            //Do the Calculation
            total = balance + depositAmount;

            //Redirect to Success Page
            request.setAttribute("total", total);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/deposit_success.jsp");
            dispatcher.forward(request,response);

        }else{

            //Redirect to Error Page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/deposit_error.jsp");
            dispatcher.forward(request,response);

        }
    }
}
