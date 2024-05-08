import java.util.Arrays;

class Solution {
    
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        int[] arr = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            arr[i] = score[i];
        }
        
        Arrays.sort(arr);
        reverseArray(arr);
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < score.length; j++) {
                if(arr[i] == score[j]) {
                    if(i == 0){
                        str[j] = "Gold Medal"; 
                    } else if(i == 1){
                        str[j] = "Silver Medal"; 
                    } else if(i == 2){
                        str[j] = "Bronze Medal"; 
                    } else {
                        str[j] = String.valueOf(i + 1); 
                    }
                } 
            }
        }
        
        return str;
    }
    
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move start and end indices towards the center
            start++;
            end--;
        }
    }
}
