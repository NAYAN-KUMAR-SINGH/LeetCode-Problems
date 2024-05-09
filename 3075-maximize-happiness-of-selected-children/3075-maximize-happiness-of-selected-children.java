class Solution {
 
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        long count = 0;
        if(k > 0){
            sum = happiness[happiness.length -1];
            count++;
            k--;
        }else {
            return 0;
        }
        
        for(int i = happiness.length - 2; i >= 0; i--){
            if(k > 0 && (happiness[i] - count) > 0 ){

                sum = sum + happiness[i] - count;
                count++;
                k--;
            }else{
                return sum;
            }
           
            
        }
        
        return sum;
    }
}