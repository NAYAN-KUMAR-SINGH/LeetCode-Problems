class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length /2;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int[] arr = new int[nums.length];
        int j = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                neg[j] = nums[i];
                j++;
            }else{
                pos[k] = nums[i];
                k++;
            }
        }
        
        for(int i = 0; i < n; i++){
            arr[2 * i] = pos[i];
            arr[2*i + 1] = neg[i];
        }
        
        return arr;
    }
}