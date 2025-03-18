package dev.lpa;
import java.util.*;

public class MobilePhone {
    ArrayList<Contact> myContacts = new ArrayList<>();
    String myNumber;

    public MobilePhone(String number) {
        myNumber = number;
        this.myContacts = new ArrayList<>();
    }

    public void addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            System.out.println("Contact is already in the list");
        } else {
            myContacts.add(contact);
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private boolean findContact(Contact contact) {
        int pos = myContacts.indexOf(contact);
        if (pos != -1) {
            System.out.println(pos);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(String number) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(number)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String number) {
        int pos = findContact(number);
        if (pos >= 0) {
            return this.myContacts.get(pos);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}

