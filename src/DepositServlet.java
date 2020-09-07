import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Step 1 - Set Content Type
        response.setContentType("text/html");

        //Step 2 - Get the Print Writer
        PrintWriter out = response.getWriter();


        //Step 3 - Generate HTML content
        out.println("<html><head>  " +
                "<meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n" +
                "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
                "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>" +
                "<script>\n" +
                "    $(document).ready(function(){\n" +
                "        $(\"#myModal\").modal('show');\n" +
                "    });\n" +
                "</script>");

        //Navigation Bar
        out.println("<nav class=\"navbar navbar-dark bg-primary\">\n<span class=\"navbar-brand mb-0 h1\">Test Bank</span>\n</nav>");

        double balance =  Double.parseDouble(request.getParameter("balance"));
        double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));
        double total;

        if(depositAmount > 0) {
            total = depositAmount + balance;

            out.println(
                    "<!-- The Modal -->\n" +
                    "<div class=\"modal\" id=\"myModal\">\n" +
                    "  <div class=\"modal-dialog\">\n" +
                    "    <div class=\"modal-content\">\n" +
                    "\n" +
                    "      <!-- Modal Header -->\n" +
                    "      <div class=\"modal-header\">\n" +
                    "        <h4 class=\"modal-title\">Deposit Success!</h4>\n" +
                    "        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n" +
                    "      </div>\n" +
                    "\n" +
                    "      <!-- Modal body -->\n" +
                    "      <div class=\"modal-body\">\n" +
                    "        <div>Initial Balance   :   " + balance + "</div>" +
                    "        <div>Withdraw Amount   :   " + depositAmount + "</div>" +
                    "        <div>Current Balance   :   " + total + "</div>" +
                    "      </div>\n" +
                    "\n" +
                    "      <!-- Modal footer -->\n" +
                    "      <div class=\"modal-footer\">\n" +
                    "        <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\n" +
                    "      </div>\n" +
                    "\n" +
                    "    </div>\n" +
                    "  </div>\n" +
                    "</div>");

        }else {
            out.println("<div id=\"myModal\" class=\"modal fade\">\n" +
                    "    <div class=\"modal-dialog\">\n" +
                    "        <div class=\"modal-content\">\n" +
                    "            <div class=\"modal-header\">\n" +
                    "                <h4 class=\"modal-title\">Invalid Amount</h4>\n" +
                    "                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n" +
                    "            </div>\n" +
                    "            <div class=\"modal-body\">\n" +
                    "\t\t\t\t<p>Please Enter cash Correctly!</p>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</div>");
        }

        out.println("</body></html>");
    }
}
