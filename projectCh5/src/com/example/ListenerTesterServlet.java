package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTesterServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("<h1>Listener Test</h1>");
        out.println("<br>Breed: " + dog.getBreed());
    }

}

