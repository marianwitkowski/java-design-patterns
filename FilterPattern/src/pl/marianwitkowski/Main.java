package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Aleksanda", "Ziółkowska", 16));
        persons.add(new Person("Jan", "Kowalski", 44));
        persons.add(new Person("Kazimierz", "Marcinkiewicz", 58));
        persons.add(new Person("Jan", "Rokita", 55));
        persons.add(new Person("Zbyszek", "Kamiński", 17));
        persons.add(new Person("Krzysztof", "Jarzyna", 72));
        persons.add(new Person("Maliwina", "Kamińska", 27));

        Criteria adultPersons = new CriteriaAdultPersons();
        Criteria femalePersons = new CriteriaFemalePersons();

        System.out.println("Adult persons:");
        printPersons(adultPersons.apply(persons));

        System.out.println("\n\nFemale persons:");
        printPersons(femalePersons.apply(persons));

        Criteria adultAndFemale = new AndCriteria(adultPersons, femalePersons);
        System.out.println("\n\nAdult and female persons:");
        printPersons(adultAndFemale.apply(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getFname() + " " + person.getLname() + ", age : " + person.getAge() + " ]");
        }
    }
}
