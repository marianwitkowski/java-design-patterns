package pl.marianwitkowski.singletons;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe mInstance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if (mInstance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (mInstance == null) {
                    mInstance = new SingletonThreadSafe();
                }
            }
        }
        return mInstance;
    }
}


