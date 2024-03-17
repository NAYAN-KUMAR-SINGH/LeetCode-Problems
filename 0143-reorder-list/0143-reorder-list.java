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
    private int getSize(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    
    private ListNode fleft;
    private ListNode tail;
    private int size;

    private void reorderListHelper(ListNode right, int floor) {
        if (right == null) {
            return;
        }
        
        reorderListHelper(right.next, floor + 1);

        if (floor > size / 2) {
            ListNode temp = fleft.next;
            fleft.next = right;
            right.next = temp;
            fleft = temp;
        } else if (floor == (size ) / 2) {
            tail = right;
            tail.next = null;
        }
    }

    public void reorderList(ListNode head) {
        size = getSize(head);
        fleft = head;
        reorderListHelper(head, 0);
    }
}
