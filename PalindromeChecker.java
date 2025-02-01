import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word or phrase
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Call the function to check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The given word or phrase is a palindrome.");
        } else {
            System.out.println("The given word or phrase is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize two pointers, one starting from the beginning and the other from the end
        int left = 0;
        int right = cleanedInput.length() - 1;

        // Compare characters from both ends towards the center
        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }

        // If we reached the middle without mismatches, it's a palindrome
        return true;
    }
}
