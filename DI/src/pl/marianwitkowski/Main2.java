package pl.marianwitkowski;

import pl.marianwitkowski.mailservice.*;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        EmailServerConnection emailServerConnection = new EmailServerConnection(
                "smtp.host.pl",
                "user",
                "password1",
                485,
                "TLS",
                60);

        RecipientList recipientList = new RecipientList();
        recipientList.add(new Recipient("user1@host.pl", "Marian Krzaklewski"));
        recipientList.add(new Recipient("user2@host.pl", "Jan Nowak"));

        List<String> attachments = new ArrayList<>();
        attachments.add("/Users/marian/file1.jpg");
        attachments.add("/Users/marian/data.xls");

        Message message = new Message("Temat", "Hello world!", attachments);


        EmailSenderExecutor emailSender = new
                EmailSenderExecutor(emailServerConnection, message, recipientList);
        emailSender.send();



    }
}
