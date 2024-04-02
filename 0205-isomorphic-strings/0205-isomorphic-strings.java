class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] sToT = new int[256]; // Array to map characters from s to characters in t
        int[] tToS = new int[256]; // Array to map characters from t to characters in s
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (sToT[charS] == 0 && tToS[charT] == 0) {
                sToT[charS] = charT; // Map charS to charT
                tToS[charT] = charS; // Map charT to charS
            } else if (sToT[charS] != charT || tToS[charT] != charS) {
                return false; // Mapping conflict
            }
        }
        
        return true;
    }
}
