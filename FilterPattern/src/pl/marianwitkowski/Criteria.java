package pl.marianwitkowski;

import java.util.List;

public interface Criteria {

    public List<Person> apply(List<Person> persons);

}
