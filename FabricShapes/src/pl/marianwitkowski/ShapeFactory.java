package pl.marianwitkowski;

public class ShapeFactory {

    public Shape createShape(String shape){
        if(shape == null || shape.trim().length()==0){
            return null;
        }

        if(shape.equalsIgnoreCase("CIRCLE")){
            Circle circle = new Circle();
            circle.setRadius(3);
            return circle;

        } else if(shape.equalsIgnoreCase("TRAPEZOID")) {
            Trapezoid trapezoid = new Trapezoid();
            trapezoid.setData(28,4,20, 20, 16);
            return trapezoid;
        }

        return null;
    }

}
