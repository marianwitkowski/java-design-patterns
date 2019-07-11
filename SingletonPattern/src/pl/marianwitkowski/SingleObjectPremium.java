package pl.marianwitkowski;

public class SingleObjectPremium {

    //create an object of SingleObject
    private static SingleObjectPremium instance = null;

    private SingleObjectPremium() {

    }

    public static synchronized SingleObjectPremium getInstance(){
        if(instance == null)
            instance = new SingleObjectPremium();
        return instance;
    }


    public void showMessage(String message){
        System.out.println(message);
    }


}
