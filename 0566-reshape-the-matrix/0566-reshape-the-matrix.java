class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();
      if ((mat.length * mat[0].length) != (r * c)) {
       return mat;  
    } 
      int[][] arr = new int[r][c];  
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    list.add(mat[i][j]);
                }
            }
        int k = 0;
         for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                   arr[i][j] = list.get(k);
                    k++;
                }
            }
        
        return arr;
    }
}