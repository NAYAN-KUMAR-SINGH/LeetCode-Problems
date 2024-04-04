import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int maxDepth(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
            } else if(s.charAt(i) == ')'){
                st.pop();
                list.add(count);
                count--;
            }
        }
        // Return the maximum depth encountered
        return list.isEmpty() ? 0 : Collections.max(list);
    }
}
