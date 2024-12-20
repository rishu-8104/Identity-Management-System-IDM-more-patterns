package fi.tamk.sade23.idm;

public interface IdentityStrategy {
    String generateEmail(Identity identity);
    String generateDisplayName(Identity identity);
}
