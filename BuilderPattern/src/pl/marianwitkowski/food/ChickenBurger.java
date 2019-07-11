package pl.marianwitkowski.food;

import pl.marianwitkowski.food.Burger;

public class ChickenBurger extends Burger {

    @Override
    public float price() {

        return 24.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
    
}