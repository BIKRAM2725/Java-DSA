class Solution {
    public int numTilings(int n) {

        int mod = 1000000007;

        int[] dp = new int[n+1];

        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;


        for(int i = 4 ; i <= n ; i++)
        {
            
            dp[i] = (int)(((2L * dp[i-1]) + dp[i-3]) % mod);         
        }
        return dp[n];
    }
}