class Solution {
    public int findMax(int[][] grid,int i ,int j){
        int max = Integer.MIN_VALUE;
         for(int k = i; k <= i + 2 ; k++){
          for(int l = j; l <= j + 2; l++){
            max = Math.max(max, grid[k][l]);
          }  
        }
   return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n - 2][n - 2];
        for(int i = 0; i < n-2 ; i++){
          for(int j = 0; j < n-2 ; j++){
            arr[i][j] = findMax(grid, i , j);
          }  
        }
        return arr;
    }
}