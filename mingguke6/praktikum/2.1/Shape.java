public class Shape {
    private String color;
    private boolean filled;

    // No-arg constructor with default values
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor with parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
