package Controllers;

import Models.BankAccount;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/BankAccountControllerServlet")
public class BankAccountControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        addBankAccount(request, response);

    }


    private void addBankAccount(HttpServletRequest request, HttpServletResponse response) {

        //Read Data from index.jsp
        String userName = request.getParameter("username");
        int accountNo = Integer.parseInt(request.getParameter("accountNo"));
        String accountType = request.getParameter("accountType");
        int balance = Integer.parseInt(request.getParameter("balance"));

        //Create the new Bank Account object
        BankAccount a = new BankAccount(userName, accountNo, accountType, balance);

        //send the Menu Page
        try{

            showMenu(request, response);
        } catch (Exception e){
            throw new SecurityException(e);
        }

    }

    private void showMenu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/menu.jsp");
        dispatcher.forward(request,response);
    }


}
