package term2;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    
class Mailjava{  
	public static void send(final String from,final String password,String to,String sub,String msg){  
		//Get properties object    
		Properties props = new Properties();    
		props.put("mail.smtp.host", "smtp.gmail.com");    
		props.put("mail.smtp.socketFactory.port", "465");    
		props.put("mail.smtp.socketFactory.class",    
				"javax.net.ssl.SSLSocketFactory");    
		props.put("mail.smtp.auth", "true");    
		props.put("mail.smtp.port", "465");    
		//get Session   
		Session session = Session.getDefaultInstance(props,   //sessionInterface 
				new javax.mail.Authenticator() {    
			protected PasswordAuthentication getPasswordAuthentication() {    
				return new PasswordAuthentication(from,password);  
			}    
		});    
		//compose message    
		try {    //try block
			MimeMessage message = new MimeMessage(session);    
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
			message.setSubject(sub);    
			message.setText(msg);    
			//send message  
			Transport.send(message);    
			System.out.println("message sent successfully");    //prints with mail is send sucessfully
		} catch (MessagingException e) {throw new RuntimeException(e);}  //catch block  

	}  
}  
class SendMail{    //sendmail class for sending mail 
	public static void main(String[] args) {    
		//from,password,to,subject,message  
		Mailjava.send("seshasaisaranya568@gmail.com","Raghuma123","mailsaisaranya@gmail.com","hello","hi this my java mail");  
		//sending mail to mailsaisaranya@gmail.com from seshasaisaranya568@gmail.com with password 
	} 
}