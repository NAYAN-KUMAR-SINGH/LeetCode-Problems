class Solution {
    public int pivotInteger(int n) {
        if(n == 1){
            return n;
        }
        int totalSum = (n * (n + 1)) / 2;
        int leftSum = 0;
        int rightSum = totalSum;
        
        for (int x = 1; x <= n; x++) {
            leftSum += x;
            if (leftSum == rightSum) {
                return x;
            }
            rightSum -= x;            
            
        }
        
        return -1;
    }
}

