package pl.marianwitkowski;

import pl.marianwitkowski.drink.CocaCola;
import pl.marianwitkowski.drink.Fanta;
import pl.marianwitkowski.food.ChickenBurger;
import pl.marianwitkowski.food.VegeBurger;

public class MealBuilder {

    //
    public Meal prepareVegeMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegeBurger());
        meal.addItem(new CocaCola());
        return meal;
    }

    public Meal prepareMeatMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Fanta());
        return meal;
    }

}
