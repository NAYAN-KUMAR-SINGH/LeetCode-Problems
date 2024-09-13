class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int xorResult = 0;
            
            for (int i = start; i <= end; i++) {
                xorResult ^= arr[i]; 
            }
            
            list.add(xorResult);
        }
        
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        
        return nums;
    }
}
