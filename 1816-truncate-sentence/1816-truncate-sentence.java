class Solution {
    public String truncateSentence(String s, int k) {
        String[] strArray = s.split(" ");
        String[] strArray1 = new String[k];
        for(int i = 0; i < k; i++){
            strArray1[i] = strArray[i];
        }
        return String.join(" ", strArray1);
    }
}
