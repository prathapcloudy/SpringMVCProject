package com.springmvc.lc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.controllers.ConfigurationFile;

public class loveAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
       Class arr[] = {ConfigurationFile.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
       String arr[] = {"/home.com/*"};
		return arr;
	}
}
