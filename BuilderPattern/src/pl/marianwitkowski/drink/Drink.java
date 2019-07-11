package pl.marianwitkowski.drink;

import pl.marianwitkowski.pack.Bottle;
import pl.marianwitkowski.Item;
import pl.marianwitkowski.pack.Packing;

public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
