package fi.tamk.sade23.idm;

import java.util.ArrayList;
import java.util.List;

public class ContactsService {
    private List<Contact> contacts;

    public ContactsService() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Add a contact from the IDM service, using the adapter pattern
    public void addContactFromIdm(Identity identity) {
        IdmToContactsAdapter contact = new IdmToContactsAdapter(identity);
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }
}
