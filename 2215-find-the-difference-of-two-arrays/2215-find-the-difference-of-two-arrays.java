import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> innerList1 = new ArrayList<>();
        List<Integer> innerList2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int count = 0;
            for (int j = 0; j < nums2.length; j++) {
                if ((nums1[i] - nums2[j]) == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && !innerList1.contains(nums1[i])) {
                innerList1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums1.length; j++) {
                if ((nums2[i] - nums1[j]) == 0) {
                    sum++;
                    break;
                }
            }
            if (sum == 0 && !innerList2.contains(nums2[i])) {
                innerList2.add(nums2[i]);
            }
        }

        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(innerList1);
        listOfLists.add(innerList2);

        return listOfLists;
    }
}
