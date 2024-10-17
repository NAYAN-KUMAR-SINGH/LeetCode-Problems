class Solution {
    public int maximumSwap(int num) {
        String s = Integer.toString(num); // Convert num to string
        int n = s.length();

        int[] maxRight = new int[10]; // To store the last occurrence of each digit
        for (int i = 0; i < 10; i++) {
            maxRight[i] = -1;
        }

        // Fill the maxRight array with the last occurrence index of each digit
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - '0'; // Convert char to integer
            maxRight[idx] = i;
        }

        // Find the first place to swap to get the largest number
        for (int i = 0; i < n; i++) {
            int currDigit = s.charAt(i) - '0';
            
            // Try to find a larger digit to swap with current one
            for (int digit = 9; digit > currDigit; digit--) {
                if (maxRight[digit] > i) {
                    // Swap the current digit with the larger one found
                    char[] charArray = s.toCharArray();
                    char temp = charArray[i];
                    charArray[i] = charArray[maxRight[digit]];
                    charArray[maxRight[digit]] = temp;
                    
                    // Return the modified number
                    return Integer.parseInt(new String(charArray));
                }
            }
        }

        return num; // If no swap is made, return the original number
    }
}