class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Calculate total number of elements
        int totalElements = m * n;
        
        // Calculate effective shift
        k %= totalElements;
        
        // Initialize result grid
        int[][] result = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the new position after k shifts
                int newPosition = (i * n + j + k) % totalElements;
                int newRow = newPosition / n;
                int newCol = newPosition % n;
                
                // Update result grid
                result[newRow][newCol] = grid[i][j];
            }
        }
        
        // Convert result grid to list of lists
        List<List<Integer>> resultList = new ArrayList<>();
        for (int[] row : result) {
            List<Integer> rowList = new ArrayList<>();
            for (int val : row) {
                rowList.add(val);
            }
            resultList.add(rowList);
        }
        
        return resultList;
    }
}