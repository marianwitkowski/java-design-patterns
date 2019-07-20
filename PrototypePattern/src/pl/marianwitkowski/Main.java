package pl.marianwitkowski;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProtoObject obj1 = new ProtoObject(10);
        System.out.println(obj1);

        try {
            ProtoObject obj2 = (ProtoObject)obj1.clone();
            System.out.println(obj2);
            //obj2.setName("Jan Kowalski");

        } catch (Exception exc) {
            exc.printStackTrace();

        }

    }
}
