import java.util.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "civic";

        // Initialize Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // 1. Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);  // Enqueue operation
            stack.push(c); // Push operation
        }

        boolean isPalindrome = true;

        // 2. Compare dequeue vs pop
        // Since queue is FIFO and stack is LIFO, comparing them
        // effectively compares the string from start to finish
        // against the string from finish to start.
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Print result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}