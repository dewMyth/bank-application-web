package Controllers;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DepositControllerServlet")
public class DepositControllerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double balance =  Double.parseDouble(request.getParameter("balance"));
        double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));

        if(depositAmount > 0) {

            //Do the Calculation
            request.setAttribute("total",  deposit(balance,depositAmount));

            //Redirect to Success Page View
            RequestDispatcher dispatcher = request.getRequestDispatcher("/deposit_success.jsp");
            dispatcher.forward(request,response);

        }else{

            //Redirect to Error Page View
            RequestDispatcher dispatcher = request.getRequestDispatcher("/deposit_error.jsp");
            dispatcher.forward(request,response);

        }
    }

    private double deposit(double balance, double depositAmount) {
        return balance + depositAmount;
    }
}

