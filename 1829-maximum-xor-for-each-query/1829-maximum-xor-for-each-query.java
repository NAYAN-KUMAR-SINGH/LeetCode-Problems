class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] arr = new int[nums.length];
        int p = (1 << maximumBit) - 1;
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] ^ nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = arr[i] ^ p;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
