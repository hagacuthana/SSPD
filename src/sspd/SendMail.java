/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sspd;
import java.util.Properties;
 
import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author julio
 */
public class SendMail {
    
    public void Send(String To,String file)
    {
        final String username = "juliogema20";
		final String password = "Thesuccesisnear";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("juliogema20@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("To"));
			message.setSubject("Testing Subject");
			message.setText(""
				+ "");
                         // Part two is attachment
//         messageBodyPart = new MimeBodyPart();
//         String filename = "/home/manisha/file.txt";
//         DataSource source = new FileDataSource(filename);
//         messageBodyPart.setDataHandler(new DataHandler(source));
//         messageBodyPart.setFileName(filename);
//         multipart.addBodyPart(messageBodyPart);
//
//         // Send the complete message parts
//         message.setContent(multipart);
//			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
    
    
    
}
