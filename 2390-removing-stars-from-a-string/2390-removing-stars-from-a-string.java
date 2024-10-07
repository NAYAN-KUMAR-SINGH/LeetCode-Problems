class Solution {
    public String removeStars(String s) {
       String str1 = "*";
        StringBuilder str = new StringBuilder(s);  
        int i = 0;

        while (i < str.length() ) {
            String dup = str.substring(i, i + 1);
            if (dup.equals(str1)  && i > 0) {
                str.delete(i - 1, i + 1); 
                i = Math.max(0, i - 1); 
            } else {
                i++; 
            }
        }
        
        return str.toString();    
    }
}