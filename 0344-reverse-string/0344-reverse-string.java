class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        StringBuilder sb = new StringBuilder(n);
        for(int i = n - 1; i >= 0; i--){
            sb.append(s[i]);
        }
        
       for(int i = 0; i < n; i++){
            s[i] = sb.charAt(i);
        }
    }
}