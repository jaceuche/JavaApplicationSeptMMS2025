// File: ShapeTest.java
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Square(4.0);
        shapes[2] = new Sphere(2.5);
        shapes[3] = new Cube(3.0);

        for (Shape currentShape : shapes) {
            System.out.printf("Shape: %s%n", currentShape);

            if (currentShape instanceof TwoDimensionalShape) {
                TwoDimensionalShape shape2D = (TwoDimensionalShape) currentShape;
                System.out.printf("Type: Two-Dimensional Shape%nArea: %.2f%n", shape2D.getArea());
            } else if (currentShape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape shape3D = (ThreeDimensionalShape) currentShape;
                System.out.printf("Type: Three-Dimensional Shape%nArea (Surface): %.2f%nVolume: %.2f%n", 
                    shape3D.getArea(), shape3D.getVolume());
            }
            System.out.println("------------------------------------");
        }
    }
}