public class RectangleTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setLength(10.0);
        rectangle.setWidth(5.0);

        System.out.println(
            "Length: " +
            rectangle.getLength()
        );

        System.out.println(
            "Width: " +
            rectangle.getWidth()
        );

        System.out.println(
            "Perimeter: " +
            rectangle.calculatePerimeter()
        );

        System.out.println(
            "Area: " +
            rectangle.calculateArea()
        );
    }
}