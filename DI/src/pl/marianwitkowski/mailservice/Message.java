package pl.marianwitkowski.mailservice;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private List<String> attachmentsList = new ArrayList<>();
    private String message;
    private String subject;


    public void addAttachment(String filename) {
        attachmentsList.add(filename);
    }

    public Message(String subject, String message, List<String> attachmentsList) {
        this.attachmentsList = attachmentsList;
        this.message = message;
        this.subject = subject;
    }

    public List<String> getAttachmentsList() {
        return attachmentsList;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }
}
