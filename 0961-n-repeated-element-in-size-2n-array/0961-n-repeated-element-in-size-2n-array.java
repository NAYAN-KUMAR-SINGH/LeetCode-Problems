class Solution {
    public int repeatedNTimes(int[] nums) {
                    int maxLen = 0;
        int count = 1;
        int n = nums.length /2;
                    for(int i = 0; i < nums.length - 1; i++){
                        for(int j = i + 1; j < nums.length; j++){
                        if(nums[i] == nums[j]){
                            count++;
                            maxLen = nums[i];
                        }
                            if(count == n){
                                break;
                            }
                    }
                    }
        
        return maxLen;
    }
}