class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        
        int count = 0;
        int n = nums.length;
        int left = 0;
        int right = 1;
        if (k == 0) {
            int duplicates = 0;
            while (right < n) {
                if (nums[right] == nums[left]) {
                    duplicates++;
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
        
        while (left < n && right < n) {
            int diff = nums[right] - nums[left];
            if (diff == k) {
                count++;
                left++;
                right++;
                while (left < n && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (right < n && nums[right] == nums[right - 1]) {
                    right++;
                }
            } else if (diff < k) {
                right++;
            } else {
                left++;
                if (left == right) {
                    right++;
                }
            }
        }
        
        return count;
    }
}

