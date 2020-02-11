package com.thd.projectname;


import com.thd.base.Constants.Constants;

/*
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
*/
public class SendEmail {

    public void sendAlertEmail(String alertFor) {
/*
        String messageContent = "Error loading workday application";

        System.out.println("Sending email ... ");

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host", Constants.MAIL_HOST);

        properties.setProperty("mail.smtp.port", Constants.MAIL_PORT);

        Session session = Session.getDefaultInstance(properties);

        int noOfRecipients = 10;

        if(alertFor.equalsIgnoreCase("BP")){
           messageContent = "Alert! The Business Process definition has changed from previous version. </br>" +
                   " Please click the link below and search for the 'Task - Edit Business Process Definition' for more audit trail information. </br>" +
                   " Link to Workday : " +
                   "https://wd5-impl.workday.com/homedepot_gms1/d/task/2997$433.htmld </br> ";
        }

        try{

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(System.getProperty("mailFrom")));

            message.setSubject("Test Alert - BP definition change");

            //message.setContent("<p><h1>" + messageContent + "</h1></p>", "text/html");

            message.setContent("<p>" + messageContent +" This is an automatically generated email, please do not reply to it. " +
                    "If you have any queries regarding this alert please contact HR QA team " + "</p>", "text/html");

            message.setHeader("X-Priority", "1");

            if(System.getProperty("mailCC") != null) {
                message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(System.getProperty("mailCC")));
            }

            for(int i = 1; i <= noOfRecipients; i++){
                if(System.getProperty("mailTo_" + i) != null){
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(System.getProperty("mailTo_" + i)));
                    Transport.send(message);
                }
             }

        }catch (MessagingException e){
            e.printStackTrace();
        }

    }

*/
    }
}
