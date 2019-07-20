package pl.marianwitkowski;

public class ProtoObject implements Cloneable {

    private int value = 0;
    public String name = "";


    public ProtoObject(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ProtoObject(this.value+1);
    }

    @Override
    public String toString() {
        return "Moja wartość to "+value;
    }
}

