class Solution {
    public int maximumProduct(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       int mod = 1000000007;
        
        for(int num: nums){
            pq.offer(num);
        }
        
        for(int i = 0; i < k ; i++){
            int min = pq.remove();
            min++;
            
            pq.offer(min);
        }
        
        long result = 1;
        while(!pq.isEmpty()){
            result *= pq.poll();
            result %= mod;
        }
        
        return (int) result;
    }
}