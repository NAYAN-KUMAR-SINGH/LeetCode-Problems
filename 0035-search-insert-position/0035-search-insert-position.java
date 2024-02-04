class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int n = 0;
        n = Arrays.binarySearch(arr, target);
        
        if(n < 0){
            n = -(n) - 1;
        }
        
        return n;        
    }
}