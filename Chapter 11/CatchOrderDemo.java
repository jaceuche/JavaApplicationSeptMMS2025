// File: CatchOrderDemo.java
public class CatchOrderDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("Testing catch order");
        } catch (ExceptionA a) {
            // This handler catches all ExceptionA and subclass (ExceptionB) objects
            System.out.println("Caught by ExceptionA handler: " + a.getMessage());
        } 
        /* // COMPILER ERROR: Unreachable catch block for ExceptionB.
        // It is already handled by the catch block for ExceptionA above.
        catch (ExceptionB b) {
            System.out.println("Caught by ExceptionB handler: " + b.getMessage());
        }
        */
    }
}