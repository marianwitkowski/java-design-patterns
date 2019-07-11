package pl.marianwitkowski.singletons;

public class SingletonLazy {


    private static SingletonLazy mInstance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (mInstance == null) {
            mInstance = new SingletonLazy();
        }
        return mInstance;
    }
}







