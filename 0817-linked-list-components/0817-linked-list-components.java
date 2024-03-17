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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int count = 0;
        boolean inComponent = false;
        ListNode temp = head;
        while (temp != null) {
            if (numSet.contains(temp.val)) {
                if (!inComponent) {
                    inComponent = true;
                    count++;
                }
            } else {
                inComponent = false;
            }
            temp = temp.next;
        }
        return count;
    }
}
