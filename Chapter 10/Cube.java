// File: Cube.java
public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        if (side < 0.0) throw new IllegalArgumentException("Side must be >= 0.0");
        this.side = side;
    }

    public double getSide() { return side; }

    @Override
    public double getArea() { return 6 * side * side; }

    @Override
    public double getVolume() { return Math.pow(side, 3); }
}