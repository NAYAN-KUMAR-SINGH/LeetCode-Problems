class Solution {
   public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int limit = (int) Math.pow(2, nums.length);
        
        for (int i = 0; i < limit; i++) {
            int temp = i;
            List<Integer> subset = new ArrayList<>();
            
            for (int j = 0; j < nums.length; j++) {
                if ((temp & 1) == 1) {
                    subset.add(nums[j]);
                }
                temp >>= 1;
            }
            result.add(subset);
        }
        return result;
    }
}