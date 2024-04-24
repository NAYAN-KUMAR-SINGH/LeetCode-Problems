class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 0){
            return 1;
        }       
        
       // int y = climbStairs(n - 1); 
       // int x = climbStairs(n - 2);
        int p = 1;
        int q = 1;
        int ans = 0;
        for(int i = 2; i <= n; i++){
            ans = p + q;
            p = q;
            q = ans;
        }
        return ans;
    }
}