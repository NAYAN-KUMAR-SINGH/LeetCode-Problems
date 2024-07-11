class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')') {
                st.push(s.charAt(i));
            } else {
                Queue<Character> q = new LinkedList<>();
                while (!st.isEmpty() && st.peek() != '(') {
                    q.add(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
                while (!q.isEmpty()) {
                    st.push(q.remove());
                }
            }
        }
        while (!st.isEmpty()) {
            sb.insert(0, st.pop()); 
        }

        return sb.toString();
    }
}