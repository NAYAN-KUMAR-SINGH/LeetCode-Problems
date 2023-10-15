class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length * 2];
        int nxtGreater[] = new int[arr.length]; 
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
       int j = nums.length ;
        for(int i = 0; i < nums.length; i++){
            arr[j] = nums[i];
            j++;
        }
        
        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            
            s.push(i);
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = nxtGreater[i];
        }
        
        
        return nums;
    }
}