
import pojo.InsertToDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        DB_Integration dbconn = new DB_Integration();
        out.println("<h2> Total number of users registered are : " + dbconn.getUserCount() + "</h2>");
        ArrayList<InsertToDB> userArrayList = dbconn.getUsers();
        req.getSession().setAttribute("userArrayList",userArrayList);
        resp.sendRedirect( req.getContextPath() + "/home.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2> Hello Word </h2>");

    }
}
