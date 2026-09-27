public class EqualSumChecker {

    // Returns true if the sum of the first two parameters equals the third
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }

    public static void main(String[] args) {
        // Test cases from the lab prompt
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}