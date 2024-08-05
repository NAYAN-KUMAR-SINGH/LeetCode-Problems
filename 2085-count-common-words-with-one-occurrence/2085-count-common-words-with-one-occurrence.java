class Solution {
    public int countWords(String[] words1, String[] words2) {
        LinkedHashMap<String, Integer> mp1 = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> mp2 = new LinkedHashMap<>();
        for (String s : words1) {
            mp1.put(s, mp1.getOrDefault(s, 0) + 1);
        }
        for (String s : words2) {
            mp2.put(s, mp2.getOrDefault(s, 0) + 1);
        }
        
        int count = 0;
        for (Map.Entry<String, Integer> entry : mp1.entrySet()) {
            String word = entry.getKey();
            if (entry.getValue() == 1 && mp2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }
        
        return count;
    }
}
