// File: Trapezoid.java
public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public double getHeight() { return height; }

    public double getArea() {
        double topSide = Math.abs(getP1().getX() - getP2().getX());
        double bottomSide = Math.abs(getP4().getX() - getP3().getX());
        return ((topSide + bottomSide) / 2.0) * getHeight();
    }
}