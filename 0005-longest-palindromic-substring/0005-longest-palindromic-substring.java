class Solution {
     public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length() < 2){
            return s;
        }
        String[] arr = new String[1];
        int max = Integer.MIN_VALUE;
       for(int i = 0; i < s.length() - 1; i++){
           for(int j = i + 1; j <= s.length(); j++){
               String str = s.substring(i, j);
               if(isPalindrome(str)){
                   int count = str.length();
                   if(max < count){
                       max = count;
                       arr[0] = str;
                   }
               }
           }
       } 
        
        return arr[0].toString();
    }
}