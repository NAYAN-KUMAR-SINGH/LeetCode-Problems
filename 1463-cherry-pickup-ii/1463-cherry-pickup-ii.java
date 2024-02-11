class Solution {
    
    public int f(int[][] g,int m, int n, int i, int j1, int j2, int[][][] dp){
        
        if(i>=m || j1<0 || j1>=n || j2<0 || j2>=n){
            return 0;
        }
        
        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];
        
        int maxi = 0;
        for(int j=j1-1;j<=j1+1;j++){
            int temp = 0;
            for(int k=j2-1;k<=j2+1;k++){
                if(j==k) continue;
                temp = Math.max(f(g,m,n,i+1,j,k,dp), temp);
            }
            maxi= Math.max(maxi, temp);
        }
        
        return dp[i][j1][j2] = g[i][j1] + g[i][j2] + maxi;
    }
    
    public int cherryPickup(int[][] g) {
        int m = g.length;
        int n = g[0].length;
        
        int[][][] dp = new int[m+1][n+1][n+1];
        
        for(int[][] ele:dp)
            for(int[] e:ele)
                Arrays.fill(e,-1);
        
        return f(g,m,n,0,0,n-1,dp);
    }
}