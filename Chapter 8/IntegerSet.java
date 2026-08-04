public class IntegerSet {

    private boolean[] set;

    public IntegerSet() {
        set = new boolean[101];
    }

    public static IntegerSet union(
        IntegerSet set1,
        IntegerSet set2
    ) {

        IntegerSet result =
            new IntegerSet();

        for (int i = 0; i <= 100; i++) {

            result.set[i] =
                set1.set[i] ||
                set2.set[i];
        }

        return result;
    }

    public static IntegerSet intersection(
        IntegerSet set1,
        IntegerSet set2
    ) {

        IntegerSet result =
            new IntegerSet();

        for (int i = 0; i <= 100; i++) {

            result.set[i] =
                set1.set[i] &&
                set2.set[i];
        }

        return result;
    }

    public void insertElement(
        int k
    ) {

        if (k >= 0 && k <= 100) {

            set[k] = true;

        } else {

            throw new IllegalArgumentException(
                "Integer must be between 0 and 100."
            );
        }
    }

    public void deleteElement(
        int m
    ) {

        if (m >= 0 && m <= 100) {

            set[m] = false;

        } else {

            throw new IllegalArgumentException(
                "Integer must be between 0 and 100."
            );
        }
    }

    public boolean isEqualTo(
        IntegerSet other
    ) {

        for (int i = 0; i <= 100; i++) {

            if (set[i] != other.set[i]) {

                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {

        StringBuilder result =
            new StringBuilder();

        boolean empty = true;

        for (int i = 0; i <= 100; i++) {

            if (set[i]) {

                result.append(i)
                      .append(" ");

                empty = false;
            }
        }

        if (empty) {

            return "---";
        }

        return result.toString().trim();
    }
}