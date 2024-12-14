class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        long ans = 0;
        Deque<Integer> maxQ = new LinkedList<>();
        Deque<Integer> minQ = new LinkedList<>();
        int l = 0, r = 0;
        while (r < n) {
            while (!maxQ.isEmpty() && nums[r] > maxQ.peekLast()) {
                maxQ.pollLast();
            }
            while (!minQ.isEmpty() && nums[r] < minQ.peekLast()) {
                minQ.pollLast();
            }
            maxQ.offerLast(nums[r]);
            minQ.offerLast(nums[r]);
            while (maxQ.peekFirst() - minQ.peekFirst() > 2) {
                if (nums[l] == maxQ.peekFirst()) {
                    maxQ.pollFirst();
                }
                if (nums[l] == minQ.peekFirst()) {
                    minQ.pollFirst();
                }
                l++;
            }
            ans += r - l + 1;
            r++;
        }
        return ans;
    }
}
