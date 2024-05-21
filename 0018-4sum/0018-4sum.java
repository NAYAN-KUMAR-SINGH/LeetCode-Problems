class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }
             for (int l = i + 1; l < nums.length - 1; l++) {
            if (l > i + 1 && nums[l] == nums[l - 1]) {
                continue; 
            }
            int j = l + 1, k = nums.length - 1;
            long tar = (long) target - nums[i] - nums[l];

            while (j < k) {
                long sum = (long) nums[j] + nums[k];
                    
                if (sum == tar) {
                    result.add(Arrays.asList(nums[i],nums[l], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++; 
                    while (j < k && nums[k] == nums[k - 1]) k--; 
                    j++;
                    k--;
                } else if (sum < tar) {
                    j++;
                } else {
                    k--;
                }
            }
         }
        }

        return result;
    }
}