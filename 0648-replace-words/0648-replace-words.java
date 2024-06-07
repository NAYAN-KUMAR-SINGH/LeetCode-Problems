class Solution {
    private String findRoot(String word, Set<String> st) {
        for (int l = 1; l <= word.length(); l++) {
            String root = word.substring(0, l);
            if (st.contains(root)) {
                return root;
            }
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> st = new HashSet<>(dictionary);
        
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            result.append(findRoot(word, st)).append(" ");
        }
        return result.toString().trim();
    }
}