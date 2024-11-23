class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char[][] mat = new char[box[0].length][box.length]; 
        for (int i = box.length - 1; i >= 0; i--) {
          for (int j = 0; j < box[0].length; j++) {
              mat[j][box.length - 1 - i] = box[i][j]; 
             }
          }        
        for(int j = 0; j < mat[0].length; j++){
            for(int i = mat.length - 1; i >= 0; i--){
                if(mat[i][j] == '*'){
                   
                }else if(mat[i][j] == '.' && i != 0){
                    int stone = -1;
                    for(int k = i - 1; k >= 0; k--){
                        if(mat[k][j] == '*'){
                            break;
                        }else if(mat[k][j] == '#'){
                            stone = k;
                            break;
                        }
                    }
                    
                    if(stone != -1){
                        mat[i][j] = '#';
                        mat[stone][j] = '.';
                    }
                }
            }
        }
        
        return mat;
    }
}