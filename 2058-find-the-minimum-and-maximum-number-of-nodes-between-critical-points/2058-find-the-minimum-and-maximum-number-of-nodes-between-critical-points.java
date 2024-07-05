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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1}; 
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = curr.next; 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int first = -1;
        int last = -1;
        int prevs = -1;

        int index = 1;
        while (nxt != null) {
       if ((prev.val > curr.val && curr.val < nxt.val) || (prev.val < curr.val && curr.val > nxt.val)) {
                if (first == -1) {
                    first = index;
                } else {
                    min = Math.min(min, index - prevs);
                }
                last = index;
                prevs = index;
            }
            index++;
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        
        if (first == -1 || last == -1 || first == last) {
            return new int[]{-1, -1}; 
        }

        max = last - first;

        return new int[]{min, max};
     }
    }