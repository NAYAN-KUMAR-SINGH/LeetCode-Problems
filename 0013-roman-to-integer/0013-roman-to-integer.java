class Solution {
    public int romanToInt(String s) {
        int count = 0;
        int i = 0;
        
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                    count += 4;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    count += 9;
                    i += 2;
                } else {
                    count += 1; 
                    i++;
                }
            } else if (ch == 'V') {
                count += 5; 
                i++;
            } else if (ch == 'X') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    count += 40;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    count += 90;
                    i += 2;
                } else {
                    count += 10;
                    i++;
                }    
            } else if (ch == 'L') {
                count += 50; 
                i++;
            } else if (ch == 'C') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    count += 400;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    count += 900;
                    i += 2;
                } else {
                    count += 100; 
                    i++;
                }  
            } else if (ch == 'D') {
                count += 500;
                i++;
            } else if (ch == 'M') {
                count += 1000; 
                i++;
            }
        } 
        
        return count;
    }
}
