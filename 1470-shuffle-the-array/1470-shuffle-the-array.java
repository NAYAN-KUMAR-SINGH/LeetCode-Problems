class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int k = 0;
        int j = n;
        int l = 0;
     for(int i = 0; i < nums.length; i++){
        if(i % 2 != 0){
            arr[k] = nums[j];
            j++;
        }else{
            arr[k] = nums[l];
            l++;
        }
         k++;
     } 
        
        return arr;
    }
}