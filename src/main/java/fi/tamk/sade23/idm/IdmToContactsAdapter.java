package fi.tamk.sade23.idm;

public class IdmToContactsAdapter implements Contact {
    private Identity identity;

    public IdmToContactsAdapter(Identity identity) {
        this.identity = identity;
    }

    @Override
    public String getFirstName() {
        return identity.getFirst();
    }

    @Override
    public String getLastName() {
        return identity.getLast();
    }

    @Override
    public String getEmail() {
        return identity.getEmail();
    }
}
