class Solution {
    public int[] singleNumber(int[] nums) {
        long xor_r = 0;
        for (int num : nums) {
            xor_r ^= num;
        }
        long mask = xor_r & (-xor_r);

        int groupa = 0;
        int groupb = 0;
        for (int num : nums) {
            if ((num & mask) != 0) {
                groupa ^= num;
            } else {
                groupb ^= num;
            }
        }
        return new int[]{groupa, groupb};
    }
}