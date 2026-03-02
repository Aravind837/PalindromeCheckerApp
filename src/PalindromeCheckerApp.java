import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "deified";

        // Use a Stack to store characters (LIFO - Last In First Out)
        Stack<Character> stack = new Stack<>();

        // Step 1 (Flow): Push characters into stack
        // This process stores characters in their original order
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 2 (Flow): Pop and compare
        // Popping from the stack naturally reverses the order
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Step 3 (Flow): Print result
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}