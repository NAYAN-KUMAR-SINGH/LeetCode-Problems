class Solution {
    public long countSubstrings(String s, char c) {
        long Count = 0;
        long total = 0;
        char[] arr = s.toCharArray();
        int num = arr.length;
        
        for (int i = 0; i < num; i++) {
            if (arr[i] == c) {
                Count++;
                total += Count;
            }
        }
        
        return total;
    }
}
