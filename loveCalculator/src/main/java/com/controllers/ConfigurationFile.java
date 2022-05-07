package com.controllers;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.springmvc.convertor.CreditCardConvertor;
import com.springmvc.formatter.AmountFormatter;
import com.springmvc.formatter.CreditCardFormatter;
import com.springmvc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.controllers","com.sessionattribute.controllers","com.modelattribute.controller"})
public class ConfigurationFile implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public MessageSource messageSource() {

		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");

		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());
		return localValidatorFactoryBean;
	}
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		
		JavaMailSenderImpl javaMailSenderImpl= new JavaMailSenderImpl();
		javaMailSenderImpl.setHost("smtp.gmail.com");
		javaMailSenderImpl.setUsername("prathapcloudy@gmail.com");
		javaMailSenderImpl.setPassword("LAKshrsh20#");
		javaMailSenderImpl.setPort(587);
		
		Properties mailProperties = new Properties();
		
		mailProperties.put("mail.smtp.starttls.enable", true);
		//mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		javaMailSenderImpl.setJavaMailProperties(mailProperties);
		
		return javaMailSenderImpl;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new PhoneNumberFormatter());
		//registry.addFormatter(new CreditCardFormatter());
		registry.addFormatter(new AmountFormatter());
		registry.addConverter(new CreditCardConvertor());
	}

	@Override
	public Validator getValidator() {

		return validator();
	}

}
