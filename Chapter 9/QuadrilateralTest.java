// File: QuadrilateralTest.java
public class QuadrilateralTest {
    public static void main(String[] args) {
        // Trapezoid
        Trapezoid trapezoid = new Trapezoid(
            new Point(0, 0), new Point(10, 0), new Point(8, 5), new Point(2, 5), 5.0);

        // Parallelogram
        Parallelogram parallelogram = new Parallelogram(
            new Point(5, 5), new Point(11, 5), new Point(12, 10), new Point(6, 10), 5.0);

        // Rectangle
        Rectangle rectangle = new Rectangle(
            new Point(17, 14), new Point(30, 14), new Point(30, 28), new Point(17, 28));

        // Square
        Square square = new Square(
            new Point(4, 4), new Point(8, 4), new Point(8, 8), new Point(4, 8));

        System.out.printf("Trapezoid Area: %.2f%n", trapezoid.getArea());
        System.out.printf("Parallelogram Area: %.2f%n", parallelogram.getArea());
        System.out.printf("Rectangle Area: %.2f%n", rectangle.getArea());
        System.out.printf("Square Area: %.2f%n", square.getArea());
    }
}