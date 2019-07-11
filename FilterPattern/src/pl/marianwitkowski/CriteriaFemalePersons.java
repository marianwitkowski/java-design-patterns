package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemalePersons implements Criteria {

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    @Override
    public List<Person> apply(List<Person> persons) {

        List<Person> foundPerson = new ArrayList<Person>();

        for (Person person : persons) {
            char lastChar = person.getFname().charAt(person.getFname().length() - 1);
            if(isVowel(lastChar)){
                foundPerson.add(person);
            }
        }
        return foundPerson;

    }
}
