class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int n = nums.length;
        int left1 = 0, left2 = 0;
        int sum1 = 0, sum2 = 0;

        for (int right = 0; right < n; right++) {
            // Update sum1 and left1
            sum1 += nums[right];
            while (left1 <= right && sum1 > goal) {
                sum1 -= nums[left1];
                left1++;
            }
  
            sum2 += nums[right];
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }

            count += left2 - left1;
        }

        return count;
    }
}
