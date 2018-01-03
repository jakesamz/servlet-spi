package com.jake.init;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{  
        System.out.println("Some client access once");  
        try {  
            req.getRequestDispatcher("/index.jsp").forward(req, resp);  
        } catch (ServletException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  

}
