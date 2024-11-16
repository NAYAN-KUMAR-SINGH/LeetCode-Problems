class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        int l = 0;
        
        for (int i = 0; i <= n - k; i++) {
            boolean isConsecutive = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] + 1 != nums[j + 1]) {
                    isConsecutive = false;
                    break;
                }
            }
            
            if (isConsecutive) {
                arr[l] = nums[i + k - 1];
            } else {
                arr[l] = -1;
            }
            
            l++;
        }
        
        return arr;
    }
}

