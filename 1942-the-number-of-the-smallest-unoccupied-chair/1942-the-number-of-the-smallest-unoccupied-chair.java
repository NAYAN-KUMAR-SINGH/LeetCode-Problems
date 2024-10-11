class Solution {
    public int smallestChair(int[][] t, int tf) {
        int n = t.length;
        int[] e = new int[n];
        int ta = t[tf][0];

        Arrays.sort(t, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] arr : t) {
            int a = arr[0];
            int d = arr[1];

            for (int i = 0; i < n; i++) {
                if (e[i] <= a) {
                    e[i] = d;
                    if (a == ta) {
                        return i;
                    }
                    break;
                }
            }
        }
        return -1;
    }
}
