package fi.tamk.sade23;

import fi.tamk.sade23.idm.Contact;
import fi.tamk.sade23.idm.ContactsService;
import fi.tamk.sade23.idm.IdmService;
import fi.tamk.sade23.idm.Staff;
import fi.tamk.sade23.idm.StaffAdapter;
import fi.tamk.sade23.idm.Student;
import fi.tamk.sade23.idm.StudentAdapter;
import fi.tamk.sade23.idm.Visitor;

public class Main {
    public static void main(String[] args) {
        IdmService idmService = new IdmService();
        ContactsService contactsService = new ContactsService();

        // Creating a visitor
        Visitor visitor = new Visitor("John", "Doe");
        idmService.createIdentity("visitor1", "password123", visitor);
        System.out.println("Visitor Identity: " + visitor.getDisplayName());

        // Creating a student
        Student student = new Student("Alice", "Johnson");
        idmService.createIdentity("student1", "password456", student);
        System.out.println("Student Identity: " + student.getDisplayName());

        // Creating a staff member
        Staff staff = new Staff("Robert", "Smith");
        idmService.createIdentity("staff1", "password789", staff);
        System.out.println("Staff Identity: " + staff.getDisplayName());

        // Adding contacts using adapters
        Contact contact1 = new StudentAdapter(student);
        contactsService.addContact(contact1);

        Contact contact2 = new StudentAdapter(student);
        contactsService.addContact(contact2);

        Contact contact3 = new StaffAdapter(staff);
        contactsService.addContact(contact3);

        // List all contacts
        System.out.println("\nAll Contacts:");
        for (Contact contact : contactsService.getAllContacts()) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName());
        }
    }
}