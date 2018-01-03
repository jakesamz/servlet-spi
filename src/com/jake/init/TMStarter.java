package com.jake.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration.Dynamic;

public class TMStarter implements AppServlertContextInitializer {

	@Override
	public void onInit(ServletContext context) {
		Dynamic testServlet = context.addServlet("test", "com.jake.init.WelcomeServlet");
		testServlet.setLoadOnStartup(1);
		testServlet.addMapping("/index.html");
	}

}
