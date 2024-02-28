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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        ListNode one = list1;
        ListNode two = list2;
        
        while (one != null && two != null) {
            if (one.val < two.val) {
                current.next = one;
                one = one.next;
            } else {
                current.next = two;
                two = two.next;
            }
            current = current.next;
        }
        
        if (one != null) {
            current.next = one;
        }
        
        if (two != null) {
            current.next = two;
        }
        
        return dummy.next;
    }
}
