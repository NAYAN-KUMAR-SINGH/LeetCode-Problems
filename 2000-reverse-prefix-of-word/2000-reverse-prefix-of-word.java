class Solution {
    public String reversePrefix(String word, char ch) {
        int j = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                j = i;
                break;
            }
        }
        
        if(j == 0) {
            return word; 
        }
       
        char[] chars = word.toCharArray();
        int start = 0;
        int end = j;
        while(start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        
        return new String(chars);
    }
}
