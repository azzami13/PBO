public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("blue", false);
        System.out.println(shape1);

        Circle circle1 = new Circle(2.5, "yellow", true);
        System.out.println(circle1);
        System.out.println("Circle Area: " + circle1.getArea());
        System.out.println("Circle Perimeter: " + circle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(3.0, 4.0, "red", false);
        System.out.println(rectangle1);
        System.out.println("Rectangle Area: " + rectangle1.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle1.getPerimeter());

        Square square1 = new Square(5.0);
        System.out.println(square1);
        System.out.println("Square Area: " + square1.getArea());
        System.out.println("Square Perimeter: " + square1.getPerimeter());
    }
}
