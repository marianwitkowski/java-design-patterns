package pl.marianwitkowski;

import pl.marianwitkowski.singletons.SingletonEnum;

public class Main {

    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();
        object.showMessage("Hello world!");

    }
}
