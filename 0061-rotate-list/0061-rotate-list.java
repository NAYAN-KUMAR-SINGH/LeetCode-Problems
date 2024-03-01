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
    public ListNode rotateNthe(ListNode head, int k){
         ListNode prev = head;
        int cnt = 1;
         while(prev != null){
            if(cnt == k){
                return prev;
            }
            cnt++;
            prev = prev.next;
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
       if(head  == null){ 
            return head;
        }
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        if(k % len == 0){ 
            return head;
        }        
       
        k = k % len;
        temp.next = head;
        ListNode prev1 = rotateNthe(head, len - k);
        head = prev1.next;
        prev1.next = null;
      
        return head;
    }
}