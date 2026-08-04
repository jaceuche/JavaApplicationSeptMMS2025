public class ArrayOperations {

    public static void main(String[] args) {

        // a) Set 10 elements of counts to zero
        int[] counts = new int[10];

        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        System.out.println("Counts:");

        for (int value : counts) {
            System.out.println(value);
        }

        // b) Add one to each element of bonus
        int[] bonus = new int[15];

        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }

        System.out.println("\nBonus:");

        for (int value : bonus) {
            System.out.println(value);
        }

        // c) Display bestScores in column format
        int[] bestScores = {95, 87, 92, 88, 100};

        System.out.println("\nBest Scores:");

        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}