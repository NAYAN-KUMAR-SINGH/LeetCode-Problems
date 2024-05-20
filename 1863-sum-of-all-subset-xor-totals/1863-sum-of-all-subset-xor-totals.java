class Solution {
    public int subsetXORSum(int[] nums) {
        int limit = (int) Math.pow(2, nums.length);
        int total = 0;
        for (int i = 0; i < limit; i++) {
            int Cxor = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    Cxor ^= nums[j];
                }
            }
            total += Cxor;
        }
        return total;
    }
}
