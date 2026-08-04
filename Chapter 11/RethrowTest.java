// File: RethrowTest.java
public class RethrowTest {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception exception) {
            System.out.println("Exception caught in main stack trace:");
            exception.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception exception) {
            System.out.println("Exception caught in someMethod. Rethrowing now...");
            throw exception; // Rethrowing exception
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Initial exception thrown in someMethod2");
    }
}