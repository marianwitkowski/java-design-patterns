package pl.marianwitkowski.mailservice;

public class EmailSenderExecutor {

    private EmailServerConnection serverConnection;
    private Message message;
    private RecipientList recipientList;

    public EmailSenderExecutor(EmailServerConnection serverConnection,
                               Message message,
                               RecipientList recipientList) {
        this.serverConnection = serverConnection;
        this.message = message;
        this.recipientList = recipientList;
    }

    public int send() {
        serverConnection.connect();
        System.out.println(String.format("Sending message with subject=%s, attachment count=%d",
                message.getSubject(), message.getAttachmentsList().size() ));
        System.out.println("Message sent");
        return 0;
    }
}
