package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegeMeal = mealBuilder.prepareVegeMeal();
        System.out.println("Vege Meal");
        vegeMeal.showItems();
        System.out.println("Total Cost: " + vegeMeal.getCost());

        Meal meatMeal = mealBuilder.prepareMeatMeal();
        System.out.println("\n\nMeat Meal");
        meatMeal.showItems();
        System.out.println("Total Cost: " + meatMeal.getCost());

    }
}
