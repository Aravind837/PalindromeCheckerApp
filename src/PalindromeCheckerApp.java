public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "racecar";

        // Step 2: Convert the string to a character array (char[])
        // This allows for efficient index-based access to individual characters
        char[] charArray = input.toCharArray();

        // Step 3: Use the Two-Pointer Technique
        // Initialize one pointer at the start and another at the end of the array
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // Step 4: Compare start and end characters moving towards the center
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit the loop if a mismatch is found
            }
            left++;  // Move the left pointer forward
            right--; // Move the right pointer backward
        }

        // Step 5: Display the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}