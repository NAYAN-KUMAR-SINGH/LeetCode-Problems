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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val); 
            head = head.next;
        }
        int sum = 0;
        for(int i =list.size() - 1; i >= 0; i--){
            sum += (Math.pow(2 ,list.size() - 1 - i)) * list.get(i); 
        }
        
        return sum;
    }
}
