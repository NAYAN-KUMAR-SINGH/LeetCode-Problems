import java.util.*;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        String sarr[] = new String[list.size()];
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = Integer.toString(list.get(i));
        }
        Arrays.sort(sarr);

        List<Integer> result = new ArrayList<>();
        for (String str : sarr) {
            result.add(Integer.parseInt(str));
        }

        return result;
    }
}
