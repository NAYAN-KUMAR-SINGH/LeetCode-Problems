class Solution {
    public int findPermutationDifference(String s, String t) {
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char ch1 = s.charAt(i);
            for(int j = 0; j < t.length(); j++){
                char ch2 = t.charAt(j);
                if(ch1 == ch2){
                    sum = sum + Math.abs(j - i);
                }
            }
        }
        
        return sum;
    }
}