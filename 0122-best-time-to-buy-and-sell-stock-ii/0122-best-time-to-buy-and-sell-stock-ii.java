class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int k = 2;

        int dp[][] = new int[n + 1][k + 1];

  
        for (int j = 0; j <= k; j++) {
            dp[n][j] = 0;
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {

            dp[i][k] = Math.max(
                dp[i + 1][k - 1] - prices[i],
                dp[i + 1][k]
            );

     
            dp[i][k - 1] = Math.max(
                dp[i + 1][k] + prices[i],
                dp[i + 1][k - 1]
            );
        }

        return dp[0][k];
    }
}