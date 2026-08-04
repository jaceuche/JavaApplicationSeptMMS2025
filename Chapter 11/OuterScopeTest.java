// File: OuterScopeTest.java
public class OuterScopeTest {
    public static void main(String[] args) {
        try { // Outer try block
            System.out.println("Entering outer try block.");
            methodWithTryBlock();
        } catch (ArithmeticException exception) { // Outer catch block
            System.out.printf("Handled in outer scope (main): %s%n", exception.getMessage());
        }
    }

    public static void methodWithTryBlock() {
        try { // Inner try block
            System.out.println("Entering inner try block in methodWithTryBlock.");
            int result = 10 / 0; // Throws ArithmeticException
        } catch (NullPointerException exception) { 
            // This catch block only handles NullPointerException,
            // so ArithmeticException slips through to the outer scope
            System.out.println("Handled NullPointerException in inner try block.");
        } finally {
            System.out.println("Inner finally block executed.");
        }
    }
}