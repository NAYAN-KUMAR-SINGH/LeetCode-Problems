class Solution {
    public boolean checkString(String s) {
        for(int i = 1; i < s.length(); i++){
            if( i > 0 && s.charAt(i - 1) == 'b' && s.charAt(i) == 'a'){
                return false;
            }
        }
        
        return true;
    }
}