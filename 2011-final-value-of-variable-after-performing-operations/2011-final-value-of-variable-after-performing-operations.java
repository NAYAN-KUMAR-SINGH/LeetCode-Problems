class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        int n = operations.length;
        for(int i=0; i  < n ; i++){
        if(operations[i].equals("X++")  || operations[i].equals("++X")){
         sum +=  1;
         }
         else {
             sum -= 1;
         }

        }
        return sum;
    }
}