// File: ExceptionTest.java
public class ExceptionTest {
    public static void main(String[] args) {
        // Demonstrate catching ExceptionB using ExceptionA catch block
        try {
            throw new ExceptionB("Exception of type ExceptionB thrown.");
        } catch (ExceptionA exception) {
            System.out.printf("Caught: %s%n", exception.getMessage());
        }

        // Demonstrate catching ExceptionC using ExceptionA catch block
        try {
            throw new ExceptionC("Exception of type ExceptionC thrown.");
        } catch (ExceptionA exception) {
            System.out.printf("Caught: %s%n", exception.getMessage());
        }
    }
}