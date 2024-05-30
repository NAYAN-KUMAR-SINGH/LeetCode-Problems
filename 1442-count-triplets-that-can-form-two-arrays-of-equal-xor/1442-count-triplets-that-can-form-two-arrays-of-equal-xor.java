class Solution {
    public int countTriplets(int[] arr) {
        int[] nums = new int[arr.length + 1];
        nums[0] = 0;
        
        int n = nums.length;
        for(int i = 1; i <= arr.length; i++){
            nums[i] = nums[i - 1] ^ arr[i - 1];
        }
        int count = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                
                if(nums[j] == nums[i]){
                    count += j - i - 1;
                    
                }
            }
        }
        
        
        return count;
    }
}