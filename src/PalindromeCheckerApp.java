class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        Node head = convertToLinkedList(input);

        if (isPalindrome(head)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    // Flow 1: Convert string to linked list
    private static Node convertToLinkedList(String s) {
        if (s.isEmpty()) return null;
        Node head = new Node(s.charAt(0));
        Node current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new Node(s.charAt(i));
            current = current.next;
        }
        return head;
    }

    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Key Concept: Fast and Slow Pointer Technique to find the middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Flow 2: Reverse second half (In-Place Reversal)
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // Flow 3: Compare halves
        Node temp = secondHalf;
        boolean result = true;
        while (temp != null) {
            if (firstHalf.data != temp.data) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return result;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}