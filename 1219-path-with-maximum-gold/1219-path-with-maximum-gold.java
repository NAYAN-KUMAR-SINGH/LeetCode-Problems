class Solution {
    int n;
    int m;
    
    public int DFS(int[][] grid, int i, int j) {
        if (i >= n || i < 0 || j >= m|| j < 0   || grid[i][j] == 0) {
            return 0;
        }

        int OriginalVal = grid[i][j];
        grid[i][j] = 0;
        int maxGold = 0;
        
        int maxGold1 = DFS(grid, i - 1, j);
        int maxGold2 = DFS(grid, i + 1, j);
        int maxGold3 = DFS(grid, i, j - 1);
        int maxGold4 = DFS(grid, i, j + 1);

        grid[i][j] = OriginalVal;
  maxGold = Math.max(maxGold1, Math.max(maxGold2, Math.max(maxGold3, maxGold4)));

        return OriginalVal + maxGold;
    }

    public int getMaximumGold(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, DFS(grid, i, j));
                  
                }
            }
        }

        return max;
    }
}
