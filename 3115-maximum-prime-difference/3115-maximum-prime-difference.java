class Solution {
    
    public boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1 || nums[i] == 0){
                continue;
            }
            if(nums[i] == 2 ){
                list.add(i);
            }else if(isPrime(nums[i])){
                list.add(i);
            }
        }
        
        if(list.size() <= 1){
            return 0;
        }
        int val = Collections.max(list) - Collections.min(list);
        return val;
    }
}