public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void backtrack(String s, int idx, List<String> list, List<List<String>> main) {
        if (idx == s.length()) {
            main.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            String str = s.substring(idx, i + 1); // Corrected bounds
            if (isPalindrome(str)) {
                list.add(str);
                backtrack(s, i + 1, list, main);
                list.remove(list.size() - 1); 
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> main = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtrack(s, 0, list, main);
        return main;
    }
}