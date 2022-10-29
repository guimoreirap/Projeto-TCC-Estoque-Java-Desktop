package util;

import java.net.InterfaceAddress;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class JavaMailApp {
    Session newSession = null;
    MimeMessage mimeMessage = null;
    public static void main(String[] args) throws MessagingException {

        JavaMailApp mail = new JavaMailApp();
        mail.setupServerProperties();
        System.out.println("aqui1");
        mail.draftEmail();
        System.out.println("aqui2");
        mail.sendEmail();
        System.out.println("aqui3");
    }

    private void setupServerProperties() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "547");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        newSession = Session.getDefaultInstance(properties, null);
    }

    private MimeMessage draftEmail() throws MessagingException {
        String[] emailRecepients = {"guilherme3652@hotmail.com", "guimoreira.ads@gmail.com"};
        String emailSubject = "Test Mail";
        String emailBody = "Testando email body";
        mimeMessage = new MimeMessage(newSession);

        for (int i = 0; i < emailRecepients.length; i++) {
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailRecepients[i]));
        }
        mimeMessage.setSubject(emailSubject);

        MimeBodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(emailBody, "html/text");
        MimeMultipart multiPart = new MimeMultipart();
        multiPart.addBodyPart(bodyPart);
        mimeMessage.setContent(multiPart);
        return mimeMessage;
    }
    
    private void sendEmail() throws NoSuchProviderException, MessagingException{
        try {
            
        
        String fromUser = "guimoreira.ads@gmail.com";
        String fromUserPassword = "gui36522032";
        String emailHost = "smtp.gmail.com";
        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserPassword);
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
        transport.close();
        System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
