class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
        int n = Arrays.binarySearch(nums, target);
        
        if(n < 0){
            n = -(n) - 1;
        }
        
        return n;        
    }
}