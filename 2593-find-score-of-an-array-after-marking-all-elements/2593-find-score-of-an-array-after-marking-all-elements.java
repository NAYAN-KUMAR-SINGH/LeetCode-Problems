import java.util.Arrays;

class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        long score = 0;
        boolean[] visited = new boolean[n];

        // Create an array of pairs (value, index)
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Sort the pairs by value
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Process the sorted pairs
        for (int i = 0; i < n; i++) {
            int value = pairs[i][0];
            int index = pairs[i][1];

            // If not visited, add the value and mark the index and its neighbors
            if (!visited[index]) {
                score += value;
                visited[index] = true;
                if (index > 0) visited[index - 1] = true;
                if (index < n - 1) visited[index + 1] = true;
            }
        }

        return score;
    }
}
