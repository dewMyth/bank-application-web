package Controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/WithdrawControllerServlet")
public class WithdrawControllerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double balance =  Double.parseDouble(request.getParameter("balance"));
        double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));

        if(withdrawAmount < balance) {
            //Do the Calculation
            request.setAttribute("total", withdraw(balance, withdrawAmount));
            //Redirect to Success Page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/withdraw_success.jsp");
            dispatcher.forward(request,response);
        }
        else if(withdrawAmount < 0){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/withdraw_error.jsp");
            dispatcher.forward(request,response);
        }
        else{
            //Redirect to Error Page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/withdraw_error.jsp");
            dispatcher.forward(request,response);
        }

    }

    public double withdraw(double balance, double withdrawAmount)  {
        return balance - withdrawAmount;
    }
}
