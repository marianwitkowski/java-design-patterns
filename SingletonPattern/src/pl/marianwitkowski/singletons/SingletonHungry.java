package pl.marianwitkowski.singletons;

public class SingletonHungry {
    private static SingletonHungry
            INSTANCE = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return INSTANCE;
    }
}


