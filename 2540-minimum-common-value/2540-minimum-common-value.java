import java.util.HashSet;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements of nums1 to HashSet
        for (int num : nums1) {
            set.add(num);
        }
        
        // Iterate over nums2 to find common elements
        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }
        
        return -1; // No common element found
    }
}
