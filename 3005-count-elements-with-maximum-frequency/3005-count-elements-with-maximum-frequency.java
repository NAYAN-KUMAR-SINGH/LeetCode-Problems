class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        int range = maxNum - minNum + 1;
        int[] frequency = new int[range];
        for (int num : nums) {
            frequency[num - minNum]++;
        }

        int maxFrequency = 0;
        for (int freq : frequency) {
            maxFrequency = Math.max(maxFrequency, freq);
        }

        int count = 0;
        for (int freq : frequency) {
            if (freq == maxFrequency) {
                count++;
            }
        }

        return maxFrequency * count;
    }
}
