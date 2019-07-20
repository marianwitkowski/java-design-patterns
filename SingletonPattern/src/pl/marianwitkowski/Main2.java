package pl.marianwitkowski;

import pl.marianwitkowski.singletons.SingletonEnum;
import pl.marianwitkowski.singletons.SingletonHungry;

public class Main2 {

    public static void main(String[] args) {


        /*
        SingleObject mySingleton = SingleObject.getInstance();
        mySingleton.showMessage("Singleton was here....");

        SingleObjectPremium myPremiumSingleton = SingleObjectPremium.getInstance();
        myPremiumSingleton.showMessage("Premium singleton was here....");

        SingleObjectPremium anotherPremiumSingleton = SingleObjectPremium.getInstance();
        anotherPremiumSingleton.showMessage("Another text in the world....");


        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        SingletonHungry singletonHungry = SingletonHungry.getInstance();
        singletonHungry.setValue(10);
        singletonHungry.getValue();
        */


        SimpleLogger logger =  SimpleLogger.getInstance();
        logger.info("Program started...");
        int x = 0;
        try {
            logger.debug("Trying dividing...");
            int y = 1/x;
        } catch (Exception exc) {
            logger.error("An error occured");
        }

    }
}
