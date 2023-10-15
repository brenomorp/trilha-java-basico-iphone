package Iphone.Phone;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private List<Contact> contactList;

    public Phone() {
        this.contactList = new ArrayList<>();
        contactList.add(new Contact("contact 1", 322));
        contactList.add(new Contact("contact 2", 551));
        contactList.add(new Contact("contact 3", 835));
    }

    public void call(String contactName) {
        for (Contact c : contactList) {
            if (c.getName().equalsIgnoreCase(contactName)) {
                System.out.println("Calling " + contactName);
            }
        }
    }

    public void answer(String callerName) {
        System.out.println("Answering " + callerName);
    }

    public void startVoiceMail(String contactName) {
        for (Contact c : contactList) {
            if (c.getName().equalsIgnoreCase(contactName)) {
                System.out.println("Starting voice mail from " + contactName);
            }
        }
    }
}
