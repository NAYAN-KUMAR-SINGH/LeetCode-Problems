class Solution {
    public int uniquePaths(int m, int n) {
       int totalSteps = m + n - 2;
        int stepsDown = m - 1;  
        long result = 1;
        for (int i = 1; i <= stepsDown; i++) {
            result = result * (totalSteps - (stepsDown - i)) / i;
        }
        
        return (int) result;  
    }
}