package pl.marianwitkowski;

public class ShapeFactory {

    public Shape createShape(String shape){
        if(shape == null || shape.trim().length()==0){
            return null;
        }

        if(shape.trim().equalsIgnoreCase("CIRCLE")) {
            Circle circle = new Circle();
            circle.setRadius(3);
            return circle;
        }

        if(shape.trim().equalsIgnoreCase("TRAPEZOID")) {
            Trapezoid trapezoid = new Trapezoid();
            trapezoid.setData(28,4,20, 20, 16);
            return trapezoid;
        }

        return null;
    }

}
