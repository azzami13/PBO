public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-arg constructor with default values
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Call superclass constructor
        this.width = width;
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to get area
    public double getArea() {
        return width * length;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + " which is a subclass of " + super.toString();
    }
}
