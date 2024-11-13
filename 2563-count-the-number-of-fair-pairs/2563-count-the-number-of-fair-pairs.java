import java.util.*;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long pairCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int targetLow = lower - nums[i];
            int targetHigh = upper - nums[i];
            int left = lowerBound(nums, targetLow, i + 1, nums.length);
            int right = upperBound(nums, targetHigh, i + 1, nums.length);
            pairCount += (right - left);
        }
        
        return pairCount;
    }

    private int lowerBound(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int upperBound(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
