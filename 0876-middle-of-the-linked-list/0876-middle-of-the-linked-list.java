/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the second middle node
        while (fast != null && fast.next != null) {
            prev = slow; // Update second middle node on each iteration
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) { // If the length of the list is odd
            return slow; // Return the second middle node
        } else { // If the length of the list is even
            return prev.next; // Return the first middle node
        }
    }
}

