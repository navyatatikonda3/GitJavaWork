package javamail;

import java.util.Properties;


import javax.mail.Message;

import javax.mail.MessagingException;

import javax.mail.PasswordAuthentication;

import javax.mail.Session;

import javax.mail.Transport;

import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;


//Yet to be completed

class SendMail{

public static void send(String from,String password,String to,String sub,String msg){

//Get properties object

Properties props = new Properties();

props.put("mail.smtp.host", "smtp.gmail.com");

props.put("mail.smtp.socketFactory.port", "465");

props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

props.put("mail.smtp.auth", "true");

props.put("mail.smtp.port", "465");

//get Session

Session session = Session.getDefaultInstance(props,

new javax.mail.Authenticator() {

protected PasswordAuthentication getPasswordAuthentication() {

return new PasswordAuthentication(from,password);

} });

//compose message

try {

MimeMessage message = new MimeMessage(session);

message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

message.setSubject(sub);

message.setText(msg);

//send message

Transport.send(message);

System.out.println("message sent successfully");

} catch (MessagingException e) {throw new RuntimeException(e);}

}

}

public class SendMailSSL{

public static void main(String[] args) {

//from,password,to,subject,message

SendMail.send("navyatatikonda95@gmail.com","majnu21956","gnanithasusan@gmail.com","Mail","How r u?");

//change from, password and to

}

}


