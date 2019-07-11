package pl.marianwitkowski.singletons;

public enum SingletonEnum {
    INSTANCE;

    int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}




