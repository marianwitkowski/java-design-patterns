package pl.marianwitkowski.singletons;

public class SingletonHungry {
    private static SingletonHungry INSTANCE = new SingletonHungry();

    private int value = 0;

    private SingletonHungry() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int i) {
        value = i;
    }

    public static synchronized SingletonHungry getInstance() {
        return INSTANCE;
    }
}


