package pl.marianwitkowski;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentOperations {

    List<Student> findByNameLength(List<Student> students, int length) {
        List<Student> result = students.stream()
                .filter(s -> s.getFirstNameLength() == length)
                .collect(Collectors.toList());
        return result;
    }

    List<Student> startWithName(List<Student> students, String prefix) {
        List<Student> result = students.stream()
                .filter(s -> s.getFirstName().toUpperCase().startsWith(prefix.toUpperCase()))
                .collect(Collectors.toList());
        return result;
    }

    List<Student> sortByName(List<Student> students) {
        List<Student> result = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        return result;
    }

    List<Student> sortByNameDesc(List<Student> students) {
        List<Student> result = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName).reversed())
                .collect(Collectors.toList());
        return result;
    }

}
