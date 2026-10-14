
package com.UseeConfiguration.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.UseeConfiguration.Dao.UserDao;
import com.UseeConfiguration.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class UserServlet extends HttpServlet {

    private UserDao userDao;

    @Override
    public void init() {
        userDao = new UserDao();
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String uname = req.getParameter("uname");
        String email = req.getParameter("email");

        if (uname == null || email == null
                || uname.trim().isEmpty()
                || email.trim().isEmpty()
                || !email.trim().matches(
                    "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {

            req.setAttribute(
                "error", "Enter a valid name and email address."
            );

            req.getRequestDispatcher(
                "/userRegistration.jsp"
            ).forward(req, res);

            return;
        }

        User user = new User(
            uname.trim(), email.trim()
        );

        try {
            boolean registered = userDao.registerUser(user);

            if (registered) {
                res.sendRedirect(
                    req.getContextPath() + "/success.jsp"
                );
            } else {
                req.setAttribute(
                    "error", "Registration could not be completed."
                );

                req.getRequestDispatcher(
                    "/userRegistration.jsp"
                ).forward(req, res);
            }

        } catch (SQLException e) {

            getServletContext().log(
                "User registration failed.", e
            );

            if ("23000".equals(e.getSQLState())) {
                req.setAttribute(
                    "error",
                    "This email is already registered."
                );
            } else {
                req.setAttribute(
                    "error",
                    "Database error. Please try again later."
                );
            }

            req.getRequestDispatcher(
                "/userRegistration.jsp"
            ).forward(req, res);
        }
    }
}
