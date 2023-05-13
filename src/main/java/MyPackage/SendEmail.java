package mypackage;
import java.util.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;

public class SendEmail {
	

	
	 static List<String> pass1 =new ArrayList<>();
	 
	 private SendEmail() {
		 pass1.add("mpghtrdzmlbexhvg");
		}
	   public static void sendemail(String recepient,String random) throws MessagingException{

		   
	    final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

	    Properties props = System.getProperties();
	    
	    props.setProperty("mail.smtp.host", "smtp.gmail.com");
	    props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	    props.setProperty("mail.smtp.socketFactory.fallback", "false");
	    props.setProperty("mail.smtp.port", "888");
	    props.setProperty("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.debug", "true");
	    props.put("mail.store.protocol", "pop3");
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.starttls.enable","true"); 
	   
	    final String username ="ahmadawwadza7@gmail.com" ;
	    pass1.add("mpghtrdzmlbexhvg");
	    final String password =pass1.get(0);
	   
	      Session session = Session.getDefaultInstance(props, 
	                          new Authenticator(){
	                             @Override
	                             protected PasswordAuthentication getPasswordAuthentication() {
	                                return new PasswordAuthentication(username, password);
	                             }});

	   
	      Message msg = new MimeMessage(session);

	
	      msg.setFrom(new InternetAddress(username));
	      msg.setRecipients(Message.RecipientType.TO, 
	                        InternetAddress.parse( recepient ,false));
	      msg.setSubject("Wellcome Cleaning System");
	       String ayya="\t"+"\t"+"\t"+"\t"+"\t"+"\t";
	      msg.setText("Dear user , \\n your order is ready, please pick it up from the company's delivery service .\"\r\n"
	      		+ayya+ "\\n Please contact the owner of this number: 0599516693 in case the delivery is delayed or there is an error in the order.\"\r\n"
	      		+ ayya+ " \\n Thank you for dealing with our company for cleaning fabrics.:\n"+random
	             );
	      msg.setSentDate(new Date());
	      Transport.send(msg);         
	   }
	       
		
		
     
   }
       
	
	
	



