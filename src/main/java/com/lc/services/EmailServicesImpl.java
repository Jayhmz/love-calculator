package com.lc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServicesImpl implements EmailService {
	
	@Autowired
	JavaMailSender mailSender;

	@Override
	public void sendEmail(String user, String userEmail, String result) {
		
		SimpleMailMessage newMail = new SimpleMailMessage();
		newMail.setTo(userEmail);
		newMail.setSubject("Oops!! Check your relationship status");
		newMail.setText("Hi "+user+". The result is "+result);
		
		mailSender.send(newMail);
		
		
	}

}
