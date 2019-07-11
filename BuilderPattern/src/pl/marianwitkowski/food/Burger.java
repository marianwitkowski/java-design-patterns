package pl.marianwitkowski.food;

import pl.marianwitkowski.Item;
import pl.marianwitkowski.pack.Packing;
import pl.marianwitkowski.pack.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
