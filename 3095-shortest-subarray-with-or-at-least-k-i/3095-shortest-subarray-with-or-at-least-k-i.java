class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
       int ans = Integer.MAX_VALUE;
        
       for(int i = 0; i < nums.length; i++){
           int count = 0;
           int len = 0;
           for(int j = i; j < nums.length; j++){
               count = count | nums[j];
               len++;
               if(count >= k){
                 ans = Math.min(ans, len);  
               }
           }
       } 
       
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}