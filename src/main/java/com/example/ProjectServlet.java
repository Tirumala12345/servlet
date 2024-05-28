package com.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontServlet/HrServlet/ProjectServlet")
public class ProjectServlet extends HttpServlet {

        public void init(ServletConfig config) throws ServletException {
            super.init(config);
            System.out.println("From projectServlet init method");
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().println("this is project servlet");
        }
}
