class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String str = words[words.length - 1];
        
        
        return str.length();
    }
}