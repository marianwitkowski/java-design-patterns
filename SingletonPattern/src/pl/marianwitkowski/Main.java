package pl.marianwitkowski;


import java.io.IOException;

public class Main {


    public static void main(String[] args)  throws IOException  {

        SingleObject object = SingleObject.getInstance();
        object.showMessage("Hello world!");



    }
}
