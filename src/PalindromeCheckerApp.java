public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define a hardcoded string
        String input = "madam";

        // Step 2: Create a reversed version of the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Step 3: Use a conditional statement (if-else) to check for a palindrome
        if (input.equals(reversed)) {
            // Step 4: Print the result to the console
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}