class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int arr[] = new int[nums1.length];
        int nxtGreater[] = new int[nums2.length]; 
        for(int i = nums2.length - 1; i >= 0; i--){
            while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = nums2[s.peek()];
            }
            
            s.push(i);
        }
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
            if(nums1[i] == nums2[j]){
                arr[i] = nxtGreater[j];
            }
        }
        }
        
        return arr;
    }
}