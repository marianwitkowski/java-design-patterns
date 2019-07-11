package pl.marianwitkowski;

public class Trapezoid implements Shape {

    private double a,b,c,d,h = 0.0d;

    public void setData(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double calcSurface() {
        return (a+b)*h*0.5;
    }

    @Override
    public double calcPerimeter() {
        return a+b+c+d;
    }

}
