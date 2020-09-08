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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        withdraw(request,response);
    }

    private void withdraw(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double balance =  Double.parseDouble(request.getParameter("balance"));
        double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
        double total;

        if(withdrawAmount < balance) {
            //Do the Calculation
            total = balance - withdrawAmount;

            //Redirect to Success Page
            request.setAttribute("total", total);
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
}
