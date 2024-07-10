class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st = new StringBuilder(s);
        StringBuilder st1 = new StringBuilder(t); 
        processBackspaces(st);
        processBackspaces(st1);
        
        return st.toString().equals(st1.toString());
    }

    private void processBackspaces(StringBuilder str) {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '#') {
                if (i > 0) {
                    str.delete(i - 1, i + 1);
                    i -= 2; 
                } else {
                    str.delete(i, i + 1);
                    i--; 
                }
            }
            i++;
        }
    }
}
