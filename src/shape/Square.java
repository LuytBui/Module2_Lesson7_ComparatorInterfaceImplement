package shape;

public class Square extends Rectangle {

    public String toString(){
        String res = "A shape.Square with side=" + getWidth() +
                ", which is a subclass of " + super.toString();
        return res;
    }

    public Square() {
        super();
        setWidth(1);
        setLength(1);
    }

    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
}
