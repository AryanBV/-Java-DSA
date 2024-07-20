import java.util.List;

// Assuming ListNode is a class you've defined elsewhere, you need to import it correctly if it's in a different package
// For example, if ListNode is in the same package, you don't need to import it. Otherwise, provide the correct import statement.
// If ListNode is not defined, here's a basic implementation you can add to your code:

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node which helps to simplify the edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move first pointer to the nth node
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move both pointers until first reaches the end of the list
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Skip the desired node
        second.next = second.next.next;
        
        // Return the new head node
        return dummy.next;
    }
    
    public static void main(String[] args) {
        // Example usage:
        Solution sol = new Solution();

        // Creating the linked list [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        // Removing the nth node from the end
        ListNode newHead = sol.removeNthFromEnd
        (head, n);

        // Printing the new list
        printList(newHead); // Expected output: [1, 2, 3, 5]
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }
}