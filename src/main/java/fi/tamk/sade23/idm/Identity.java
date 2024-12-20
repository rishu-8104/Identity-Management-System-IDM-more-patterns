package fi.tamk.sade23.idm;

public class Identity {
    private String first;
    private String last;
    private IdentityStrategy strategy;
    private String email;
    private String displayName;
    private Integer id;

    public Identity(String firstName, String lastName, IdentityStrategy strategy) {
        this.first = firstName;
        this.last = lastName;
        this.strategy = strategy;
        this.email = strategy.generateEmail(this);
        this.displayName = strategy.generateDisplayName(this);
    }

    public String generateEmail() {
        return email;
    }

    public String generateDisplayName() {
        return displayName;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
