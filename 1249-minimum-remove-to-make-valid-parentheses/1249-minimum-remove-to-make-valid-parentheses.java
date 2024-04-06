
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else if (ch == ')') {
                if (!st.isEmpty()) {
                    st.pop();
                } else {
                    sb.setCharAt(i, '*'); // Mark invalid closing parenthesis
                }
            }
        }

        // Mark remaining unmatched opening parentheses
        while (!st.isEmpty()) {
            sb.setCharAt(st.pop(), '*');
        }

        // Construct valid string without marked characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }
}
