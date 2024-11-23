package LPOO.Exercicio1Paternidade;

// Subclass Square
class Square extends Rectangle {

    // No-arg constructor
    public Square() {
    }

    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with all parameters
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and setter for side
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
