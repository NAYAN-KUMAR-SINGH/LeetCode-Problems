class Solution {
    public boolean isSubstringPresent(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String str1 = s.substring(i, i + 2);
            if (s.indexOf(new StringBuilder(str1).reverse().toString()) != -1) {
                return true;
            }
        }
        return false;
    }
}
