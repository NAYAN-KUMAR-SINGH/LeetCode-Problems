class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] != nums[j]) {
                        arr[1] = j - 1;
                        break;
                    }
                }
                
                if (arr[1] == -1) {
                    arr[1] = nums.length - 1;
                }
                
                break;
            }
        }

        return arr;
    }
}
