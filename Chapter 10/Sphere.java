// File: Sphere.java
public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        if (radius < 0.0) throw new IllegalArgumentException("Radius must be >= 0.0");
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double getArea() { return 4 * Math.PI * radius * radius; }

    @Override
    public double getVolume() { return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); }
}