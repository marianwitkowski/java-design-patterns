package pl.marianwitkowski.mailservice;

import java.util.ArrayList;
import java.util.List;

public class RecipientList {

    private List<Recipient> recipientList = new ArrayList<>();

    public void add(Recipient recipient) {
        recipientList.add(recipient);
    }

}
