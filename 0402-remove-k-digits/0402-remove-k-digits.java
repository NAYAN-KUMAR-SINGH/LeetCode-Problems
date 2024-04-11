class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i = 0; i < n; i++){
            char c = num.charAt(i);
            while(!st.empty() && st.peek() > c && k > 0){
                st.pop();
                k--;
            }
            if(!st.empty() || c != '0'){
                st.push(c);
            }
        }
        while(!st.empty() &&  k > 0){
                st.pop();
                k--;
            }
        if(st.empty()){
            return "0";
        }
        
        StringBuilder str = new StringBuilder();
        int n2 = st.size();
        for(int i = 0; i < n2; i++){
            str = str.append(st.pop());
        }
        return str.reverse().toString();
        
    }
}
