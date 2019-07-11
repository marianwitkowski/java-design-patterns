package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    List<Student> students;

    public StudentDaoImpl(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Jan", "Kowalski", 100);
        Student student2 = new Student("Adam", "Nowak", 101);
        Student student3 = new Student("Zygmunt", "Staszczyk", 102);

        students.add(student1);
        students.add(student2);
        students.add(student3);

    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.stream().filter(s -> s.getRollNo() == rollNo).findFirst().get();
    }

    @Override
    public void updateStudent(Student student) {
        for (Student s: students) {
            if (s.getRollNo()==student.getRollNo()) {
                s = student;
                return;
            }
        }
    }

    @Override
    public void deleteStudent(Student student) {
        students.removeIf(s->s.getRollNo()==student.getRollNo());
    }
}
