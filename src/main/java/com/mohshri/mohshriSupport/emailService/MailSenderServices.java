package com.mohshri.mohshriSupport.emailService;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MailSenderServices {
	
	 @Autowired
	  public JavaMailSender emailSender;
	 @Async
	 public void sendSimpleMessage(String to, String subject, String text) {
		 try {
			 MimeMessage msg = emailSender.createMimeMessage();
			 MimeMessageHelper helper = new MimeMessageHelper(msg, true);
			 helper.setTo(to);
			 helper.setSubject(subject);
			 helper.setText(text, true);
			 emailSender.send(msg);
	        System.err.println("mail Sent Successfully....");
		 }catch (Exception e) {
			 e.printStackTrace();
		}   
		 }
	 
}
