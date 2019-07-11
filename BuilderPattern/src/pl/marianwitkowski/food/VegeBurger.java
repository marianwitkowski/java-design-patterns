package pl.marianwitkowski.food;

import pl.marianwitkowski.food.Burger;

public class VegeBurger extends Burger {

    @Override
    public float price() {
        return 17.0f;
    }

    @Override
    public String name() {
        return "Vege Burger";
    }

}