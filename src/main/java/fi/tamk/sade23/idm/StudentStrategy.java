package fi.tamk.sade23.idm;

public class StudentStrategy implements IdentityStrategy {
    @Override
    public String generateEmail(Identity identity) {
        // Implement email generation logic for students
        return identity.getFirst().toLowerCase() + "." + identity.getLast().toLowerCase() + "@tuni.fi";
    }

    @Override
    public String generateDisplayName(Identity identity) {
        // Implement display name logic for students
        return identity.getFirst() + " " + identity.getLast();
    }
}
