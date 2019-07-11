
package pl.marianwitkowski;

public class Circle implements Shape {

    private double radius = 0.0d;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSurface() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

}
