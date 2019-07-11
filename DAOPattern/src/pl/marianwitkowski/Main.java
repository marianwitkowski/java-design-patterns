package pl.marianwitkowski;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();

        System.out.println("\nPrint all students");
        List<Student> list = studentDao.getAllStudents();
        printData(list);

        System.out.println("\nPrint student 100");
        Student student = studentDao.getStudent(100);
        if (student==null) {
            System.out.println("Student not found");
        } else {
            System.out.println(String.format("Student [%d] %s %s",
                    student.getRollNo(), student.getFname(), student.getLname() ));
        }

        if (student!=null) {
            System.out.println("Removing student 100");
            studentDao.deleteStudent(student);
        }

        System.out.println("\nPrint all students again");
        list = studentDao.getAllStudents();
        printData(list);

        System.out.println("\nUpdating student 101");
        student = studentDao.getStudent(101);
        if (student!=null) {
            student.setFname("Krzysztof");
            student.setLname("Krawczyk");
            studentDao.updateStudent(student);
            System.out.println("\nPrint all students again");
            list = studentDao.getAllStudents();
            printData(list);
        }

    }

    private static void printData(List<Student> students) {
        if (students==null) {
            System.out.println("No data");
        } else {
            for (Student student: students) {
                System.out.println(String.format("Student [%d] %s %s",
                        student.getRollNo(), student.getFname(), student.getLname() ));
            }
        }
    }
}
