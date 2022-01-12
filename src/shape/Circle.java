package shape;

public class Circle extends Shape{
    private double radius;

    @Override
    public String toString(){
        String res = "A shape.Circle with radius=" + radius +
                 ", which is a subclass of " + super.toString();
        return res;
    }


    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
