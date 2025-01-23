// ltcode004.java

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the result list construction
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both linked lists
        while (l1 != null || l2 != null) {
            // Get the values from the current nodes, or 0 if the node is null
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum and the new carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry for the next iteration
            current.next = new ListNode(sum % 10); // Create a new node with the digit

            // Move to the next nodes in the lists
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's a carry left, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node of the dummy head, which is the actual result
        return dummyHead.next;
    }
}

public class ltcode004 {
    public static void main(String[] args) {
        // Create first number: 342 (2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second number: 465 (5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two numbers
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output should be: 7 0 8 (which represents the number 807)
    }
}