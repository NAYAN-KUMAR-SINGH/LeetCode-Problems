class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        int[] arr = new int[2];
        int temp = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
               i+=1;
                continue;
                
            }
            else if(j < 2){
               arr[j] = nums[i];
                j++;
            }
        }
        
        if (j < 2 && nums[nums.length - 1] != nums[nums.length - 2]) {
            arr[j] = nums[nums.length - 1];
        } 
        
        
        return arr;
    }
}