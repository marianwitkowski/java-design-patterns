package pl.marianwitkowski;

import java.util.List;

public class StudentFacade {


    public List<Student> startWithName(String prefix) {
        if (prefix==null) return null;
        List<Student> result = new StudentOperations().startWithName(prefix);
        return result;
    }

    public List<Student> sortByName() {
        List<Student> result = new StudentOperations().sortByName();
        return result;
    }

    public List<Student> sortByNameDesc() {
        List<Student> result = new StudentOperations().sortByNameDesc();
        return result;
    }

    public List<Student> findWithNameLenght(int length) {
        if (length<=0) return null;
        List<Student> result = new StudentOperations().findByFirstNameLength(length);
        return result;
    }


}
