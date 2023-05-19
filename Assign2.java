import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        try {
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Enter the first string:");
                String first = input.nextLine();
                System.out.println("Enter the second string:");
                String second = input.nextLine();
                if (first == null && second == null) {
                    throw new Exception("String should not be null");
                }
                // length determining
                System.out.println("Length of the first string: " + first.length());
                // concatinating
                String concatenated = first.concat(second);
                System.out.println("Concatenated String: " + concatenated);
                // Reversed
                String reversedFirst = reverseString(first);
                System.out.println("Reversed First string: " + reversedFirst);
                String reversedSecond = reverseString(second);
                System.out.println("Reversed Second string: " + reversedSecond);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}
