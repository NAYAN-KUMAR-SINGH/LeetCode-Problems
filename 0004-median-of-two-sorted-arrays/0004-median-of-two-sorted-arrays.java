class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        
        for(int i = 0; i < nums1.length; i++){
            arr[i] = nums1[i];
        }
        int j = 0;
        for(int i = nums1.length; i < arr.length; i++){
            arr[i] = nums2[j];
            j++;
        }
        
        Arrays.sort(arr);
         for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        double mid = arr.length % 2 == 0 ? (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0 : arr[arr.length / 2];
        
        return mid;
    }
}