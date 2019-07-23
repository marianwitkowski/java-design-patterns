package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentOperations {

    List<Student> students = new ArrayList<>(30);

    //ustawiamy dane
    public StudentOperations() {
        students.add(new Student("Jan", "Kowalski"));
        students.add(new Student("Marian", "Nowak"));
        students.add(new Student("Marek", "Zieliński"));
        students.add(new Student("Krystyna", "Czubówna"));
        students.add(new Student("Agnieszka", "Wielka"));
        students.add(new Student("Katarzyna", "Mała"));
    }

    //dodajemy studenta
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student findByFirstAndLastName(String fname, String lname) {
        Student result = students.stream()
                .filter(s -> s.getFirstName().equalsIgnoreCase(fname) )
                .filter(s -> s.getLastName().equalsIgnoreCase(lname) )
                .findFirst().get();
        return result;
    }

    public List<Student> findByFirstNameLength(int length) {
        List<Student> result = students.stream()
                .filter(s -> s.getFirstNameLength() == length)
                .collect(Collectors.toList());
        return result;
    }

    public List<Student> startWithName(String prefix) {
        List<Student> result = students.stream()
                .filter(s -> s.getFirstName().toUpperCase().startsWith(prefix.toUpperCase()))
                .collect(Collectors.toList());
        return result;
    }

    public List<Student> sortByName() {
        List<Student> result = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        return result;
    }

    public List<Student> sortByNameDesc() {
        List<Student> result = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName).reversed())
                .collect(Collectors.toList());
        return result;
    }

    //metoda nie jest wystawiona przez fasadę
    public void removeStudent(String fname, String lname) {
        Student student = findByFirstAndLastName(fname, lname);
        if (student!=null) {
            students.remove(student);
        }
    }


}
