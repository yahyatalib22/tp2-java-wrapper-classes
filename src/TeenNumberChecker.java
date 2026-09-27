public class TeenNumberChecker {

    // Checks whether at least one number is between 13 and 19 (inclusive)
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    // Checks whether a single number is between 13 and 19 (inclusive)
    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

    public static void main(String[] args) {
        // hasTeen tests
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        // isTeen tests
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
}