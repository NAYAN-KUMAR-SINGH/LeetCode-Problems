class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }
        for (int size = 2; size <= Math.min(matrix.length, matrix[0].length); size++) {
            for (int i = 0; i <= matrix.length - size; i++) {
                for (int j = 0; j <= matrix[0].length - size; j++) {
                    boolean isSquare = true;
                    for (int k = 0; k < size; k++) {
                        for (int l = 0; l < size; l++) {
                            if (matrix[i + k][j + l] == 0) {
                                isSquare = false;
                                break;
                            }
                        }
                        if (!isSquare) break;
                    }
                    if (isSquare) {
                        count++; 
                    }
                }
            }
        }
        
        return count;
    }
}
