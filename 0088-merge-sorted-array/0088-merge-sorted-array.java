import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        if (m == 0 && n > 0) {
            // If nums1 is empty, and nums2 has elements, copy nums2 into nums1
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n > 0) {
            // Merge nums2 into nums1
            for (int i = m; i < nums1.length && j < n; i++, j++) {
                nums1[i] = nums2[j];
            }
        }

        Arrays.sort(nums1);
    }
}
