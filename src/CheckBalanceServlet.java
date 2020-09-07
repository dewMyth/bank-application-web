import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CheckBalanceServlet")
public class CheckBalanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Step 1 - Set Content Type
        response.setContentType("text/html");

        //Step 2 - Get the Print Writer
        PrintWriter out = response.getWriter();


        //Step 3 - Generate HTML content
        out.println("<html><head>   <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"  </head><body>");
        out.println("Your Balance is Balance : " + request.getParameter("balance"));
        out.println("</body></html>");
    }
}
