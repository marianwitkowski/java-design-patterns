package pl.marianwitkowski.singletons;

public class SingletonStaticInnerClass {


    private SingletonStaticInnerClass() {
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {

        private static final SingletonStaticInnerClass
                INSTANCE = new SingletonStaticInnerClass();

    }

}


