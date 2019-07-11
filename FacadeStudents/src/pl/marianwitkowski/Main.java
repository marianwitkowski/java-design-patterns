package pl.marianwitkowski;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] persons = { "Jan", "Marek", "Alicja", "Marian", "Zbyszek",
                    "Edward", "Martyna", "Krystyna", "Mariusz"};
        StudentFacade studentFacade = new StudentFacade(persons);

        List<Student> result = studentFacade.findWithNameLenght(6);
        printList(result);

        result = studentFacade.startWithName("MAR");
        printList(result);

        result = studentFacade.sortByName();
        printList(result);

        result = studentFacade.sortByNameDesc();
        printList(result);
    }

    private static void printList(List<Student> list) {
        if (list==null) {
            System.out.println("No data to print");
            return;
        }
        System.out.println("================");
        for (Student student: list) {
            System.out.println(student.getFirstName());
        }
        System.out.println();
    }
}
