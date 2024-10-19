
public class Cylinder extends Shape {
    private double radius, height;  

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}
