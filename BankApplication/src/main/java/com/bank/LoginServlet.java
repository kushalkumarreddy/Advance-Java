package com.bank;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    private String adminEmail;

    public void init(ServletConfig config) throws ServletException {

        super.init(config);

        adminEmail = config.getInitParameter("adminEmail");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        ServletContext context = getServletContext();

        String bankName = context.getInitParameter("bankName");

        if (username.equals("kushal") &&
            password.equals("1234")) {

            HttpSession session = request.getSession();

            session.setAttribute("username", username);

            response.sendRedirect("dashboard");

        } else {

            response.setContentType("text/html");

            response.getWriter().println(
                "<h2>Invalid Username or Password</h2>"
            );

            response.getWriter().println(
                "<a href='login.html'>Try Again</a>"
            );
        }
    }
}