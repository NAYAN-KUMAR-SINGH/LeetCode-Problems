class Solution {
     public static boolean isPalindrome(String str){
            int left = 0;
            int right = str.length() - 1;
            while(left < right){
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            
            return true;
        }
        
    public int countSubstrings(String s) {
       int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <=s.length(); j++ ){
                String str1 = s.substring(i , j);
                if( isPalindrome(str1)){
                    count++;
                }
            }
        }
        
        return count;
    }
}