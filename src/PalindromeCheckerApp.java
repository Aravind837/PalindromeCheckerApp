import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "rotator";

        // Initialize a Deque (Double-Ended Queue)
        // Deque allows insertion and deletion from both ends
        Deque<Character> deque = new ArrayDeque<>();

        // Flow 1: Insert characters into the deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Flow 2 & 3: Remove first & last characters and compare until empty
        // This enables direct comparison of the front and rear elements
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}