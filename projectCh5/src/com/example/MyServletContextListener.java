package com.example;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();
        String breed = context.getInitParameter("breed");
        Dog dog = new Dog(breed);
        context.setAttribute("dog", dog);
    }

    public void contextDestroyed(ServletContextEvent event) {
    
    }

}
