public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> tempList = new ArrayList<>();
        for (int i = 0; i <= n - 3; i += 3) {
            if (nums[i + 2] - nums[i + 1] <= k && nums[i + 1] - nums[i] <= k && nums[i + 2] - nums[i] <= k) {
                tempList.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
            } else {
                return new int[0][];
            }
        }

        int[][] res = new int[tempList.size()][3];
        for (int i = 0; i < tempList.size(); i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = tempList.get(i).get(j);
            }
        }
        return res;
    }
}