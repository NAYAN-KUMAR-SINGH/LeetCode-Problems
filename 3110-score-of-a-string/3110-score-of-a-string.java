class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            int chN = ch;
            int chN1 = ch1;
            int sub = chN - chN1;
            sum = sum + Math.abs(sub);
        }
        
        return sum;
    }
}