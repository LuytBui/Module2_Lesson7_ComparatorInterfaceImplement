package shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    @Override
    public String toString(){
        String res = "A shape.Rectangle with width=" + width + " and length= " + length +
                ", which is a subclass of " + super.toString();
        return res;
    }

    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
