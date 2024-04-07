class Solution {

    class chara {
        char num;
        int pos;

        chara(char num, int pos) {
            this.num = num;
            this.pos = pos;
        }
    }

    public boolean checkValidString(String s) {
        Stack<chara> st = new Stack<>();
        Stack<chara> str = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                str.push(new chara('*', i));
            } else if (c == '(') {
                st.push(new chara('(', i));
            } else if (c == ')') {
                if (st.size() > 0 && st.peek().num == '(') {
                    st.pop();
                } else if (str.size() > 0) {
                    str.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.size() > str.size()) {
            return false;
        }
        while (!st.empty()) {
            if (str.empty() || st.peek().pos > str.peek().pos) {
                return false;
            }
            st.pop();
            str.pop();
        }
        return true;
    }
}