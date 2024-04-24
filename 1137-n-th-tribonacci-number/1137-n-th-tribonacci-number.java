class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        int nums0 = 0;
        int nums1 = 1;
        int nums2 = 1;
        int nums = 0;
        
        for (int i = 3; i <= n; i++) {
            nums = nums0 + nums1 + nums2;
            nums0 = nums1;
            nums1 = nums2;
            nums2 = nums;
        }
        
        return nums;
    }
}
