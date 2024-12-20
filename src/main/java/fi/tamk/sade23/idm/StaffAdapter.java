package fi.tamk.sade23.idm;

public class StaffAdapter implements Contact {
    private Staff staff;

    public StaffAdapter(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String getFirstName() {
        return staff.getDisplayName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return staff.getDisplayName().split(" ")[1];
    }

    @Override
    public String getEmail() {
        return staff.generateEmail(null); // You can provide an Identity object here if needed.
    }
}
