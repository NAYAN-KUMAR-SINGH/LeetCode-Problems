class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] str1 = sentence1.split(" ");
        String[] str2 = sentence2.split(" ");
        if(str1.length > str2.length){
         return areSentencesSimilar(sentence2, sentence1);   
        }
        
        int start = 0;
        int end1 = str1.length - 1;
        int end2 = str2.length - 1;
        
        while(start < str1.length && str1[start].equals(str2[start])){
            start += 1;
        }
        
       while (end1 >= 0 && end2 >= 0 && str1[end1].equals(str2[end2])) {
            end1--;
            end2--;
        }
        
        
        return start > end1;
    }
}