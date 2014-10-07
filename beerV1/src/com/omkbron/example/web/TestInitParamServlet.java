package com.omkbron.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

public class TestInitParamServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("Testing init-param's <br>");

        Enumeration params = getServletConfig().getInitParameterNames();

        while(params.hasMoreElements()) {
           out.println("<br>param name: " + params.nextElement() + "<br>");
        }

        out.println("Main Email is: " + getServletConfig().getInitParameter("mainEmail") + "<br>");
        out.println("Admin Email is: " + getServletConfig().getInitParameter("adminEmail") + "<br>");
    }

}
