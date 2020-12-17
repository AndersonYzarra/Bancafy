package Mail;

import java.util.Properties;
import java.util.Random;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

 //@author Anderson

public class SendEmail {
    public String getRandom(){
        Random rnd  = new Random();
        int number = rnd.nextInt(99999);
     return String.format("%06d", number);
    }
    
    public boolean sendEmail(User user){
        boolean test = false;
        String toEmail = user.getEmail();
        String fromEmail = "suppbancafy@gmail.com";
        String password = "123456bancafy";
        
        try {       
            // your host email smtp server details
            Properties pr = new Properties();
            pr.setProperty("mail.smtp.host", "smtp.gmail.com");
            pr.setProperty("mail.smtp.port", "587");
            pr.setProperty("mail.smtp.auth", "true");
            pr.setProperty("mail.smtp.starttls.enable", "true");
            pr.put("mail.smtp.socketFactory.port", "587");
            pr.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 
            Session session = Session.getInstance(pr, new Authenticator() {
              @Override
              protected PasswordAuthentication getPasswordAuthentication(){
                  return new PasswordAuthentication(fromEmail, password);
              }
            });
          
         Message mess = new MimeMessage(session);
         mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
         mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
         mess.setSubject("Verificación de cuenta[Bancafy]");
         
         mess.setText("Registro Completado.Porfavor verifique su cuenta usando el siguiente codigo: " + user.getCode());
       
        Transport.send(mess);
        test=true;
        
        } catch (MessagingException e) {
        }
        
        return test;
        
    }
    
    }
