package com.bank;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null ||
            session.getAttribute("username") == null) {

            response.sendRedirect("login.html");
            return;
        }

        String username =
                (String) session.getAttribute("username");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<h2>ABC Bank</h2>");
        out.println("<hr>");

        out.println("<h3>Welcome " + username + "</h3>");

        out.println("<p>Account Balance: ₹50,000</p>");

        out.println("<a href='logout'>Logout</a>");

        out.println("</body>");
        out.println("</html>");
    }
}