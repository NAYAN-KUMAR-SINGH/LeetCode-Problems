class Solution {
    public long maxMatrixSum(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        long sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] <= 0){
                    list.add(-matrix[i][j]);
                    count++;
                }else{
                    sum += matrix[i][j];
                }
                min = Math.min(min, Math.abs(matrix[i][j]));
                
            }
        }
        Collections.sort(list);
        
        if(list.size() % 2 != 0){
            
            for(int i = 0; i < list.size(); i++){                
                    sum = sum + list.get(i);
                
            }
            
            return sum - 2*min;
        }else{
           for(int i = 0; i < list.size(); i++){                
                    sum += list.get(i);                
            }  
        }
        
        
        
     return sum;   
    }
}