package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cirle =  shapeFactory.createShape("CIRCLE");
        if (cirle!=null) {
            System.out.println(String.format("It's me %s. My surface is %.3f and perimeter is %.3f ",
                    cirle.getClass().getName(), cirle.calcSurface(), cirle.calcPerimeter()));
        }

        Shape trapezoid = shapeFactory.createShape("TRAPEZOID");
        if (trapezoid!=null) {
            System.out.println(String.format("It's me %s. My surface is %.3f and perimeter is %.3f ",
                    trapezoid.getClass().getName(), trapezoid.calcSurface(), trapezoid.calcPerimeter()));
        }

        System.out.println("\n\n");

    }
}
