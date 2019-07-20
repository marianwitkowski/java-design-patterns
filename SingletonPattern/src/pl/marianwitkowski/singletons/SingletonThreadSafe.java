package pl.marianwitkowski.singletons;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe mInstance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if (mInstance == null) {
            /*
            Metoda typu synchronized zajmuje zamek związany z obiektem,
            dla którego jest wywoływana, będzie zatem wykluczać wykonanie
            innych metod typu synchronized lub bloków synchronized na tym obiekcie.
             */
            synchronized (SingletonThreadSafe.class) {
                if (mInstance == null) {
                    mInstance = new SingletonThreadSafe();
                }
            }
        }
        return mInstance;
    }
}


