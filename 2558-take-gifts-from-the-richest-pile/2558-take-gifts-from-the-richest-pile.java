class Solution {
    public long pickGifts(int[] gifts, int k) {
       Arrays.sort(gifts);
       long sum = 0;
        int j = gifts.length - 1;
       for(int i = 0; i < k;i++){
         gifts[j] = (int)Math.sqrt(gifts[j]);
         Arrays.sort(gifts);
         j = gifts.length - 1;
       }
        
        for(int i = 0; i < gifts.length; i++){
           sum += gifts[i];
        }
        
        return sum;
    }
}