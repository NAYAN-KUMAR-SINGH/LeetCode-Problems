class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int i = 0, j = n - 1;
        while (j >= i) {
            int mid = i + (j - i) / 2;
            if (citations[mid] == n - mid) {
                return citations[mid];
            } else if (citations[mid] < n - mid) {
                i = mid + 1; 
            } else {
                j = mid - 1; 
            }
        }
        return n - i; 
    }
}