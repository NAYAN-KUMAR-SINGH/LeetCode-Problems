class Solution {
    public boolean checkString(String s) {
       Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!st.isEmpty() && st.peek() == 'b' && s.charAt(i) == 'a'){
                return false;
            }else{
                st.push(s.charAt(i));
            }
        }
        
        return true;
    }
}