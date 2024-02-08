import java.util.ArrayList;

class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
     
        for (int i = 1; i * i <= n; i++) {
            list.add(i * i);
        }

   
        if (list.contains(n)) {
            return 1;
        }
        
        
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            
            dp[i] = Integer.MAX_VALUE;
            
            for (int j = 0; j < list.size(); j++) {
            int square = list.get(j);
            if (square > i) break;
            dp[i] = Math.min(dp[i], dp[i - square] + 1);
}

        }
        return dp[n];
    }
}
