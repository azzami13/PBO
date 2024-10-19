public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // 1st Constructor: Default values for radius and color
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd Constructor: Given radius, default color
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // 3rd Constructor: Given radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to return the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // toString method to describe the circle
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
