package com.mohshri.mohshriSupport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohshri.mohshriSupport.Dto.EmailData;
import com.mohshri.mohshriSupport.Dto.Message;
import com.mohshri.mohshriSupport.emailService.MailSenderServices;

@RestController
public class SupportController {

	@Autowired 
	MailSenderServices mailSender;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*", methods = RequestMethod.POST)
	@PostMapping("/support-mail")
	public Message emailSend(@RequestBody EmailData email) {
		Message m=new Message();
		if(email !=null) {
			StringBuffer str=new StringBuffer();
			try {
				str.append("<br><br><br><b>Company Name:- </b>"+email.getCompanyName());
				str.append("<br><b>Email:- </b>"+email.getEmail());
				str.append("<br><b>Mobile:- </b>"+email.getPhone());
				str.append("<br><b>Services:- </b>"+email.getServices());
				str.append("<br><b>About:- </b>"+email.getAboutProject());
//				mailSender.sendSimpleMessage("ranjeetnityanand@gmail.com", "Mohshir Info Mail" , str.toString());
				mailSender.sendSimpleMessage("mohshricare@gmail.com", "Mohshir Info Mail" , str.toString());
				m.setCode(200);
				m.setMessage("Mail Sent, We'll get touch with you shortly");
				return m;
		}catch (Exception e) {
			e.printStackTrace();
			m.setCode(300);
			m.setMessage("Error!!!");
			m.setDescription(e.getMessage());
			return m;
		}
	}else {
		m.setCode(301);
		m.setMessage("Invalid Data!!");
		return m;
	}
	}
}
