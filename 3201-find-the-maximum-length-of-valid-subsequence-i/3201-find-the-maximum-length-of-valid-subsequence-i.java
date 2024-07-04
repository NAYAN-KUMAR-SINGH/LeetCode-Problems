import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {
        int[] same = new int[2];
        int[] diff = new int[2];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int curRem = nums[i] % 2;
            same[curRem] = same[curRem] + 1;
            diff[curRem] = Math.max(diff[curRem], 1 + diff[1 ^ curRem]);
        }

        return Math.max(Math.max(same[0], same[1]), Math.max(diff[0], diff[1]));
    }

}