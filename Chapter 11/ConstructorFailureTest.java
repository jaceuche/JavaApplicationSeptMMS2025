// File: ConstructorFailureTest.java
public class ConstructorFailureTest {
    public static void main(String[] args) {
        try {
            System.out.println("Attempting to instantiate SomeClass...");
            SomeClass obj = new SomeClass();
        } catch (Exception exception) {
            System.out.printf("Caught constructor exception: %s%n", exception.getMessage());
        }
    }
}