package com.springmvc.lc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class loveCalculator //implements WebApplicationInitializer 
{

	
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(Configuration.class);
		
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		ServletRegistration.Dynamic servDynamic = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		servDynamic.setLoadOnStartup(1);
		servDynamic.addMapping("/mywebsite.com/*");
	}

}
