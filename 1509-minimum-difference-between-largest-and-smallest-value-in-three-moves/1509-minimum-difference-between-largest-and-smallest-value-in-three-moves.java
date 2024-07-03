class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        if(nums.length < 4){
            return 0;
        }
        for(int i = 1; i <= 4; i++){
           min = Math.min(min, Math.abs(nums[nums.length - i] - nums[4 - i]));
        }
        return min;
    }
}