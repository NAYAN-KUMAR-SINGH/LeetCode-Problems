class Solution {
    public int minLength(String s) {
        String str1 = "AB";
        String str2 = "CD";
        StringBuilder str = new StringBuilder(s);  
        int i = 0;

        while (i < str.length() - 1) {
            String dup = str.substring(i, i + 2);
            if (dup.equals(str1) || dup.equals(str2)) {
                str.delete(i, i + 2); 
                i = Math.max(0, i - 1); 
            } else {
                i++; 
            }
        }
        
        return str.length(); 
    }
}
