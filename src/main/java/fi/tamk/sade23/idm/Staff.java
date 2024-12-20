package fi.tamk.sade23.idm;

public class Staff implements IdentityStrategy {
    private String first;
    private String last;

    public Staff(String first, String last) {
        this.first = first;
        this.last = last;
    }

     public String getDisplayName() {
        return first + " " + last;
    }
    
    @Override
    public String generateDisplayName(Identity identity) {
        return first + " " + last;
    }
   

    @Override
    public String generateEmail(Identity identity) {
        // Implement generateEmail logic for staff
        return first.toLowerCase() + "." + last.toLowerCase() + "@example.com";
    }
}
