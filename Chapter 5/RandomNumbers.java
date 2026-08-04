public class RandomNumbers {

    public static void main(String[] args) {

        int a = (int)(Math.random() * 2) + 1;
        int b = (int)(Math.random() * 100) + 1;
        int c = (int)(Math.random() * 10);
        int d = (int)(Math.random() * 113) + 1000;
        int e = (int)(Math.random() * 3) - 1;
        int f = (int)(Math.random() * 15) - 3;

        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
        System.out.println("e) " + e);
        System.out.println("f) " + f);
    }
}