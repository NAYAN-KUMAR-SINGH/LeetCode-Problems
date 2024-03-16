class Solution {
    public int findMaxLength(int[] nums) {
        int[] sumIndex = new int[2 * nums.length + 1];
        int maxLen = 0, sum = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;

            if (sum == nums.length) {
                maxLen = i + 1; 
            } else {
                if (sumIndex[sum] != 0) {
                    maxLen = Math.max(maxLen, i - sumIndex[sum] + 1);
                } else {
                    sumIndex[sum] = i + 1;
                }
            }
        }

        return maxLen;
    }
}
