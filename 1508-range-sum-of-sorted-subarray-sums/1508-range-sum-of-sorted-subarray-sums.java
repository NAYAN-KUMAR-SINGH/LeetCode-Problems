import java.util.ArrayList;
import java.util.Collections;

class Solution {
    ArrayList<Integer> list = new ArrayList<>();

    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum = 0;
        generateSubarrays(nums, 0, 0);
        Collections.sort(list);
        for (int i = left - 1; i < right; i++) {
            sum = (sum + list.get(i)) % 1000000007;
        }
        return sum;
    }

    public void generateSubarrays(int[] arr, int start, int end) {
        if (start >= arr.length) return;
        if (end < arr.length) {
            addSubarray(arr, start, end);
            generateSubarrays(arr, start, end + 1);
        } else {
            generateSubarrays(arr, start + 1, start + 1);
        }
    }

    public void addSubarray(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        list.add(sum);
    }
}
