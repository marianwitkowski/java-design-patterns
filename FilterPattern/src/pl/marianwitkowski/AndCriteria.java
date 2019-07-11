package pl.marianwitkowski;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria firstCriteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria otherCriteria) {
        this.firstCriteria = firstCriteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> apply(List<Person> persons) {
        List<Person> firstCriteriaPersons = firstCriteria.apply(persons);
        return otherCriteria.apply(firstCriteriaPersons);
    }

}
