/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int size(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1 = headA;
        ListNode head2 = headB;
        
        int sizeA = size(headA);
        int sizeB = size(headB);
        
        int delta = Math.abs(sizeA - sizeB);
        if (sizeA > sizeB) {
            for (int i = 0; i < delta; i++) {
                head1 = head1.next;
            }
        } else {
            for (int i = 0; i < delta; i++) {
                head2 = head2.next;
            }
        }
        
        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return head1;
    }
}
