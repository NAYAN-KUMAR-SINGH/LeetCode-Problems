class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int product = 1;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                continue;
            }else{                
                product *= nums[i];
            }
            
        }  
        if(count > 1){
            return arr;
        }
       else if(count == 1){
            for(int i = 0; i < nums.length; i++){
                 if(nums[i] == 0){
                   arr[i] = product;  
                 }else{
                        arr[i] = 0;
                 }   
            }        
        }else{
            for(int i = 0; i < nums.length; i++){                
                   arr[i] = product / nums[i]; 
                  
            }  
        }
         

        return arr;
    }
}