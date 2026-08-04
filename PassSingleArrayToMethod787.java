public class PassSingleArrayToMethod787 {
    public static int[] getEvens(int[] arr) {
        int count = 0;
        for (int n : arr) if (n % 2 == 0) count++;
        int[] evens = new int[count];
        int i = 0;
        for (int n : arr) if (n % 2 == 0) evens[i++] = n;
        return evens;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 4, 2, 9, 0, 1, 6, 8};
        int[] evens = getEvens(arr);
        System.out.print("Even numbers: ");
        for (int e : evens) System.out.print(e + " ");
        System.out.println();
    }
}