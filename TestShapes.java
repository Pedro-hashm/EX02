package LPOO.Exercicio1Paternidade;

// Test class
class TestShapes {
    public static void main(String[] args) {
        // Testing Circle class
        Circle circle = new Circle(5.5, "green", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Testing Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Testing Square class
        Square square = new Square(4.0, "red", true);
        System.out.println(square);
        square.setSide(7.0);
        System.out.println("Updated " + square);
    }
}

