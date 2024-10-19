public class Square extends Rectangle {

    // Constructor with side length
    public Square(double side) {
        super(side, side); // Call Rectangle constructor with same side length
    }

    // Override toString() method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + " which is a subclass of " + super.toString();
    }

    // Override setWidth and setLength to ensure square geometry
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
}