
import java.util.Scanner;

public class Assign3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int palindromeCount = 0;
            int notPalindromeCount = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter the string: ");
                String palindrome = input.nextLine();
                String reversed = "";

                for (int j = palindrome.length() - 1; j >= 0; j--) {
                    reversed += palindrome.charAt(j);
                }

                if (palindrome.equalsIgnoreCase(reversed)) {
                    System.out.println("String is Palindrome");
                    palindromeCount++;
                } else {
                    System.out.println("String is not Palindrome");
                    notPalindromeCount++;
                }
            }

            System.out.println("String was Palindrome " + palindromeCount + " times.");
            System.out.println("String was not Palindrome " + notPalindromeCount + " times.");
        }
    }
}
