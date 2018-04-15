package com.app.util;

import java.io.IOException;
import java.io.InputStream;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.MailSendException;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Component
public class CommonUtil {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public boolean sendEmail(String toAddr,String subject,String text,final CommonsMultipartFile file){
		boolean flag=true;
		MimeMessage message=javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message,true);
			helper.setSubject(subject);
			helper.setText(text);
			helper.setTo(toAddr);
			helper.setFrom("arizraza0@gamil.com");
			if(file!=null){
				
				helper.addAttachment(file.getOriginalFilename(), 
						new InputStreamSource() {

					public InputStream getInputStream() throws IOException {
						return file.getInputStream();
					}
				});
			}//close if
			
		} catch (MessagingException e) {
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}
public boolean sendEmail(String toAddr,String subject,String text){
	return sendEmail(toAddr, subject, text);
}
}
