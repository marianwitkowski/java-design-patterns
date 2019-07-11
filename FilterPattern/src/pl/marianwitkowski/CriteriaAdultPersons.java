package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.List;

public class CriteriaAdultPersons implements Criteria {

    @Override
    public List<Person> apply(List<Person> persons) {
        List<Person> foundPerson = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getAge()>=18){
                foundPerson.add(person);
            }
        }
        return foundPerson;
    }
}
