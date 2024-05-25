import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (mp.containsKey(ch)) {
                int count = mp.get(ch);
                if (count - 1 > 0) {
                    mp.put(ch, count - 1);
                } else {
                    mp.remove(ch);
                }
            } else {
                return ch;
            }
        }
        for (char ch : mp.keySet()) {
            return ch;
        }
        return '\0';
    }
}
