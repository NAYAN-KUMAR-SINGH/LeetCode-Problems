class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (head != null) {
            ListNode tail = prev;
            
            // Check if there are k nodes remaining
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    // Less than k nodes remaining, no need to reverse
                    return dummy.next;
                }
            }
            
            // Reverse the k nodes
            ListNode nextGroup = tail.next;
            ListNode[] reversed = reverse(head, tail);
            head = reversed[0];
            tail = reversed[1];
            
            // Connect the reversed group to the previous group
            prev.next = head;
            tail.next = nextGroup;
            
            // Update prev for the next iteration
            prev = tail;
            head = nextGroup;
        }
        
        return dummy.next;
    }
    
    // Helper method to reverse the nodes from head to tail
    private ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;
        while (prev != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return new ListNode[]{tail, head};
    }
}
