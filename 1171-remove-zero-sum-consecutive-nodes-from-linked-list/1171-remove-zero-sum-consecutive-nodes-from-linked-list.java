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
import java.util.*;

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0); // Dummy node to handle the case where the whole list sums to zero
        dummy.next = head;
        ListNode temp = dummy;

        while (temp != null) {
            int sum = 0;
            ListNode current = temp.next;
            while (current != null) {
                sum += current.val;
                if (sum == 0) {
                    temp.next = current.next;
                }
                current = current.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}
