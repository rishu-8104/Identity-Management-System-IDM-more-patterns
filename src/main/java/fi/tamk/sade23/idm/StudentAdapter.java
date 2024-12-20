package fi.tamk.sade23.idm;

public class StudentAdapter implements Contact {
    private Student student;

    public StudentAdapter(Student student) {
        this.student = student;
    }

    @Override
    public String getFirstName() {
        return student.getDisplayName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return student.getDisplayName().split(" ")[1];
    }

    @Override
    public String getEmail() {
        return student.generateEmail(null); // You can provide an Identity object here if needed.
    }
}
