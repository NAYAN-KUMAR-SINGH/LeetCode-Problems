class Solution {
    public int maximumLength(String s) {
        int max = -1;
        
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            int currentLen = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    currentLen++;
                } else {
                    if (currentLen > 0) {
                        for (int len = 1; len <= currentLen; len++) {
                            String sub = String.valueOf(c).repeat(len);
                            if (countSubstrings(s, sub) >= 3) {
                                max = Math.max(max, len);
                            }
                        }
                    }
                    currentLen = 0;
                }
            }
            
            if (currentLen > 0) {
                for (int len = 1; len <= currentLen; len++) {
                    String sub = String.valueOf(c).repeat(len);
                    if (countSubstrings(s, sub) >= 3) {
                        max = Math.max(max, len);
                    }
                }
            }
        }
        
        return max > 0 ? max : -1;
    }

    private int countSubstrings(String s, String sub) {
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }
}

