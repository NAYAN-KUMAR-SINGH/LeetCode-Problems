class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        
        int temp = -1;
       for(int i = 0; i < nums.length - 1; i++){
          for(int j =  i + 1; j < nums.length; j++){
           if((nums[j] + nums[i]) == 0){
             
              if(temp <= nums[j]){
                 temp = nums[j];  
              }
           }  
         } 
       }      
               
        return temp;
    }
}