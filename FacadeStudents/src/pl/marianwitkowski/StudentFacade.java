package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.List;

public class StudentFacade {

    private List<Student> students = new ArrayList<>();

    public StudentFacade() {
    }

    public StudentFacade(String[] students) {
        for (String student: students) {
            String s = student.trim();
            if (s.length()>0) {
                addStudent(s);
            }
        }
    }

    public StudentFacade(List<Student> students) {
        this.students = students;
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public List<Student> startWithName(String prefix) {
        if (prefix==null) return null;
        List<Student> result = new StudentOperations().startWithName(this.students, prefix);
        return result;
    }

    public List<Student> sortByName() {
        List<Student> result = new StudentOperations().sortByName(this.students);
        return result;
    }

    public List<Student> sortByNameDesc() {
        List<Student> result = new StudentOperations().sortByNameDesc(this.students);
        return result;
    }

    public List<Student> findWithNameLenght(int length) {
        if (length<=0) return null;
        List<Student> result = new StudentOperations().findByNameLength(this.students, length);
        return result;
    }

}
