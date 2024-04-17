import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        // Sort the array to utilize two-pointer approach
        Arrays.sort(nums);
        
        int count = 0;
        int n = nums.length;
        int left = 0;
        int right = 1;
        
        // Handle special case when k is 0
        if (k == 0) {
            int duplicates = 0;
            while (right < n) {
                if (nums[right] == nums[left]) {
                    // Count duplicate pairs
                    duplicates++;
                    // Skip over duplicate values
                    while (right < n && nums[right] == nums[left]) {
                        right++;
                    }
                } else {
                    left = right;
                    right++;
                }
            }
            return duplicates;
        }
        
        // General case when k is non-zero
        while (left < n && right < n) {
            int diff = nums[right] - nums[left];
            if (diff == k) {
                count++;
                // Move both pointers to find unique pairs
                left++;
                right++;
                // Skip over duplicate values for the left pointer
                while (left < n && nums[left] == nums[left - 1]) {
                    left++;
                }
                // Skip over duplicate values for the right pointer
                while (right < n && nums[right] == nums[right - 1]) {
                    right++;
                }
            } else if (diff < k) {
                // Move the right pointer to increase the difference
                right++;
            } else {
                // Move the left pointer to decrease the difference
                left++;
                // Ensure the left pointer is behind the right pointer
                if (left == right) {
                    right++;
                }
            }
        }
        
        return count;
    }
}

