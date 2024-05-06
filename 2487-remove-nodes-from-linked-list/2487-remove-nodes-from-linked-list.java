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
    public ListNode removeNodes(ListNode head) {
      ListNode temp = head;
Stack<Integer> st = new Stack<>();

while (temp != null) {
   
    while (!st.isEmpty() && temp.val > st.peek()) {
        st.pop();
    }
    st.push(temp.val); 
    temp = temp.next; 
}


ListNode result = null;
while (!st.isEmpty()) {
    ListNode newNode = new ListNode(st.pop());
    newNode.next = result;
    result = newNode;
}

        
        return result;
    }
}