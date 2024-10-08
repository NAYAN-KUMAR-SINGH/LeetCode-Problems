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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] sp = new int[m][n];
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        ListNode current = head;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; ++i) {
                if (current != null) {
                    sp[top][i] = current.val;
                    current = current.next;
                }else{
                     sp[top][i] = -1;
                }
            }
            top++;
            for (int i = top; i <= bottom; ++i) {
                if (current != null) {
                    sp[i][right] = current.val;
                    current = current.next;
                }else{
                    sp[i][right] = -1;
                }
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    if (current != null) {
                        sp[bottom][i] = current.val;
                        current = current.next;
                    }else{
                        sp[bottom][i] = -1;
                    }
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    if (current != null) {
                        sp[i][left] = current.val;
                        current = current.next;
                    }else{
                       sp[i][left] = -1;  
                    }
                }
                left++;
            }
        }
        
        return sp;
    }
}

