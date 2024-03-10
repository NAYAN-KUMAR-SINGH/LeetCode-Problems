import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
       
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {          
                if (nums1[i] == nums2[j] && !list.contains(nums1[i])) {
                    int count1 = countOccurrences(nums1, nums1[i]);
                    int count2 = countOccurrences(nums2, nums1[i]);
                    int minCount = Math.min(count1, count2);
                    for (int k = 0; k < minCount; k++) {
                        list.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
    
    private int countOccurrences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
}
