import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == n) {
                    if (!list.contains(n)) {
                        list.add(n);
                    }
                    break; 
                }
            }
        }
        

        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}
