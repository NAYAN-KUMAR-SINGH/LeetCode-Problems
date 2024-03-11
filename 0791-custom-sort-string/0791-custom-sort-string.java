class Solution {
    public String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder();
        int[] count = new int[26]; // Assuming lowercase English letters
        
        // Count occurrences of characters in s
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        // Append characters from order based on their occurrence in s
        for (char ch : order.toCharArray()) {
            while (count[ch - 'a']-- > 0) {
                str.append(ch);
            }
        }
        
        // Append remaining characters in s that are not in order
        for (char ch = 'a'; ch <= 'z'; ch++) {
            while (count[ch - 'a']-- > 0) {
                str.append(ch);
            }
        }
        
        return str.toString();
    }
}
