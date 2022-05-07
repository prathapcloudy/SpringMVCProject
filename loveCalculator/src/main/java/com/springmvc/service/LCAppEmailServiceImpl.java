package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService{
	
	//@Autowired
	 JavaMailSenderImpl javaMailSenderImpl  = new JavaMailSenderImpl();

	@Override
	public void sendEmail(String userName,String userEmail, String result) {
		 
		SimpleMailMessage newMail = new SimpleMailMessage();
		newMail.setTo(userEmail);
		newMail.setSubject("love calculation");
		newMail.setText("Hi " + userName + "The Result predicted by the App is " + result);
		
		javaMailSenderImpl.send(newMail);
	}

}
