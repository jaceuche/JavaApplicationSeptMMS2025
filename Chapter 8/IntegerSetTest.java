public class IntegerSetTest {

    public static void main(
        String[] args
    ) {

        IntegerSet set1 =
            new IntegerSet();

        IntegerSet set2 =
            new IntegerSet();

        set1.insertElement(1);
        set1.insertElement(3);
        set1.insertElement(5);
        set1.insertElement(7);
        set1.insertElement(9);

        set2.insertElement(2);
        set2.insertElement(3);
        set2.insertElement(5);
        set2.insertElement(8);
        set2.insertElement(10);

        System.out.println(
            "Set 1: " +
            set1
        );

        System.out.println(
            "Set 2: " +
            set2
        );

        IntegerSet union =
            IntegerSet.union(
                set1,
                set2
            );

        System.out.println(
            "Union: " +
            union
        );

        IntegerSet intersection =
            IntegerSet.intersection(
                set1,
                set2
            );

        System.out.println(
            "Intersection: " +
            intersection
        );

        System.out.println(
            "Are Set 1 and Set 2 equal? " +
            set1.isEqualTo(set2)
        );

        set1.deleteElement(1);

        System.out.println(
            "Set 1 after deleting 1: " +
            set1
        );

        IntegerSet emptySet =
            new IntegerSet();

        System.out.println(
            "Empty set: " +
            emptySet
        );
    }
}