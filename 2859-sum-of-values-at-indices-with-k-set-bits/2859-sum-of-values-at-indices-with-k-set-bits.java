class Solution {
      public static int sumOfBinaryDigits(int number) {
        String binaryString = Integer.toBinaryString(number);
        int sum = 0;
        for (char ch : binaryString.toCharArray()) {
            sum += ch - '0'; 
        }
         
        
        return sum;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
       for(int i = 0; i < nums.size(); i++){
           if(sumOfBinaryDigits(i) == k){
               sum += nums.get(i);
           }
       }
        
        return sum;
    }
}