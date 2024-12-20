package fi.tamk.sade23.idm;

public class StaffStrategy implements IdentityStrategy {
    @Override
    public String generateEmail(Identity identity) {
        // Implement email generation logic for staff
        return identity.getFirst().toLowerCase() + "." + identity.getLast().toLowerCase() + "@tuni.fi";
    }

    @Override
    public String generateDisplayName(Identity identity) {
        // Implement display name logic for staff
        return identity.getFirst() + " " + identity.getLast();
    }
}
