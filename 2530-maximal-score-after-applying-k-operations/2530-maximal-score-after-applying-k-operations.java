class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        for (int num : nums) {
            pq.add(num);
        }

        while (k > 0) {
            int maxEl = pq.poll();
            sum += maxEl;
            maxEl = (int) Math.ceil(maxEl / 3.0);
            pq.add(maxEl);
            k--;
        }

        return sum;
    }
}