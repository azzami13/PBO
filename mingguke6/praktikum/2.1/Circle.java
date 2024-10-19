public class Circle extends Shape {
    private double radius;

    // No-arg constructor with default radius
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Call superclass constructor
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + " which is a subclass of " + super.toString();
    }
}
