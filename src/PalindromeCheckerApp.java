public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the original string
        String original = "radar";
        String reversed = "";

        // Step 2: Reverse the string using a for loop
        // We iterate through the characters of the string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // String concatenation (+) is used to build the reversed string
            reversed += original.charAt(i);
        }

        // Step 3: Compare the original and reversed strings
        // The equals() method compares the actual content of the String objects
        if (original.equals(reversed)) {
            // Step 4: Display the result
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}