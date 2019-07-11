package pl.marianwitkowski;

public class Student {
    private String fname;
    private String lname;
    private int rollNo;

    public Student(String fname, String lname, int rollNo) {
        this.fname = fname;
        this.lname = lname;
        this.rollNo = rollNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}