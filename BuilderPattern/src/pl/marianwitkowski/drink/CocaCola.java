package pl.marianwitkowski.drink;

public class CocaCola extends Drink {

    @Override
    public float price() {
        return 4.0f;
    }

    @Override
    public String name() {
        return "Coca-Cola";
    }
}
