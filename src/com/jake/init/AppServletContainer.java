package com.jake.init;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes(AppServlertContextInitializer.class)
public class AppServletContainer implements ServletContainerInitializer {

	public void onStartup(Set<Class<?>> arg0, ServletContext arg1) throws ServletException {
		System.out.println("calling onStartup....");
		for (Class<?> class1 : arg0) {
			try {
				((AppServlertContextInitializer)class1.newInstance()).onInit(arg1);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
