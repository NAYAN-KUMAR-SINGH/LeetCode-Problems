class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, count = 0;
        int totalSubsets = 1 << nums.length;

        for (int mask = 0; mask < totalSubsets; mask++) {
            int currOr = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((mask & (1 << i)) != 0) {
                    currOr |= nums[i];
                }
            }
            if (currOr > maxOr) {
                maxOr = currOr;
                count = 1;
            } else if (currOr == maxOr) {
                count++;
            }
        }

        return count;
    }
}
