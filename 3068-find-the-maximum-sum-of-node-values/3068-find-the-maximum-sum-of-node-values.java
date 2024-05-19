class Solution {
    
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
      long sum = 0;
       int count  = 0;
       int min = Integer.MAX_VALUE;
        
        for(int num : nums){
            if((num ^ k) > num){
                count++;
                sum += num^k;
            }else{
                sum += num;
            }
            
            min = Math.min(min, Math.abs((num ^k) - num));
        }
        
        if(count % 2 == 0){
            return sum;
        }
        
        return sum - min;
    }
}