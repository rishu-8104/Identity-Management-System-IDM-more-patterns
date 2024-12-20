package fi.tamk.sade23.idm;

public class VisitorStrategy implements IdentityStrategy {
    @Override
    public String generateEmail(Identity identity) {
        // Implement email generation logic for visitors (not provisioned)
        return "";
    }

    @Override
    public String generateDisplayName(Identity identity) {
        // Implement display name logic for visitors
        return identity.getFirst() + " " + identity.getLast();
    }
}
