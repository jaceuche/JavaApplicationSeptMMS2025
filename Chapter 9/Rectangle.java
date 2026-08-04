// File: Rectangle.java
public class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4, Math.abs(p1.getY() - p4.getY()));
    }
}