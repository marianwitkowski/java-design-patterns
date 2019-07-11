package pl.marianwitkowski;

public class Student {

    private String firstName;

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getFirstNameLength() {
        return firstName == null ? 0 : firstName.length();
    }
}
