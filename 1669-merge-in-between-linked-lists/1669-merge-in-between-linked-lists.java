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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        dummy.next = list1;
        
        ListNode current = dummy;
        for (int i = 0; i < a; i++) {
            current = current.next;
        }
        
        ListNode afterB = current;
        for (int i = 0; i < b - a + 2; i++) {
            afterB = afterB.next;
        }
        
     
        current.next = list2;
        
        while (list2.next != null) {
            list2 = list2.next;
        }
        
        list2.next = afterB;
        
        return dummy.next;
    }
}
