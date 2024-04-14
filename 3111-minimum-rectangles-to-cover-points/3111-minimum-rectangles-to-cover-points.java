class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        List<Pair<Integer, Integer>> v = new ArrayList<>();

        for (int[] it : points) {
            v.add(new Pair<>(it[0], it[1]));        }

        Collections.sort(v, Comparator.comparingInt(a -> a.getKey()));        
        int ans = 1;
        int cur = v.get(0).getKey();
        for (int i = 1; i < v.size(); i++) {
            if (v.get(i).getKey() <= cur + w) {
                continue;
            } else {
                ans++;
                cur = v.get(i).getKey();
            }
        }
        
        return ans;
    }

    static class Pair<X, Y> {
        X key;
        Y value;
        
        Pair(X key, Y value) {
            this.key = key;
            this.value = value;
        }
        
        X getKey() {
            return key;
        }
        
        Y getValue() {
            return value;
        }
    }
}



