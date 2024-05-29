package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HrServlet extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("From HrServlet init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/ProjectServlet");
        dispatcher.forward(req, resp);
    }
}
