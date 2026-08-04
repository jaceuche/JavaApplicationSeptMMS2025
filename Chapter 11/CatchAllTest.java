// File: CatchAllTest.java
import java.io.IOException;

public class CatchAllTest {
    public static void main(String[] args) {
        // Catching ExceptionA
        try {
            throw new ExceptionA("Throwing ExceptionA");
        } catch (Exception exception) {
            System.out.printf("Caught polymorphically: %s%n", exception.getClass().getName());
        }

        // Catching ExceptionB
        try {
            throw new ExceptionB("Throwing ExceptionB");
        } catch (Exception exception) {
            System.out.printf("Caught polymorphically: %s%n", exception.getClass().getName());
        }

        // Catching NullPointerException
        try {
            throw new NullPointerException("Throwing NullPointerException");
        } catch (Exception exception) {
            System.out.printf("Caught polymorphically: %s%n", exception.getClass().getName());
        }

        // Catching IOException
        try {
            throw new IOException("Throwing IOException");
        } catch (Exception exception) {
            System.out.printf("Caught polymorphically: %s%n", exception.getClass().getName());
        }
    }
}