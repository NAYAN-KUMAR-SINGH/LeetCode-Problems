class Solution {
    public static int sumOfBinaryDigits(int number) {
        String binaryString = Integer.toBinaryString(number);
        int sum = 0;
        for (char ch : binaryString.toCharArray()) {
            sum += ch - '0'; 
        }
        
        return sum;
    }
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sumOfBinaryDigits(i);
        }
        
        return arr;
    }
}