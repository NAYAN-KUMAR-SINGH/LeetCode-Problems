class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
       for(int i = 0; i < nums.length - 1; i++){
        
               if(nums[i] == nums[i+1]){
                   int n = nums[i];
                   return n;
               }
           
       } 
        return -1;
    }
}