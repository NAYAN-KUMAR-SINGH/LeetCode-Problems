    class Solution {
        public static int countNicePairs(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        long count = 0;
        
        for (int num : nums) {
            int revNum = reverse(num);
            int diff = num - revNum;
            count += freqMap.getOrDefault(diff, 0);
            freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
        }
        
        return (int) (count % 1000000007);
    }

    private static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
    }