class Solution {
    public String removeDuplicates(String s) {
     
        StringBuilder str = new StringBuilder(s);  
        int i = 0;

        while (i < str.length() - 1 ) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            if (ch == ch1) {
                str.delete(i, i + 2); 
                i = Math.max(0, i - 1); 
            } else {
                i++; 
            }
        }
        
        return str.toString();   
    }
}