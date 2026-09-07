class Solution {
    int mod =1000000007;

    public int distinctSubseqII(String s) {
        int n =s.length();

        int[] prev =new int[n + 1];
        int[] lastSeen = new int[26];

        for (int i =1;i <= n; i++) {
            int idx =s.charAt(i - 1) - 'a';

            prev[i] =lastSeen[idx];
            lastSeen[idx] = i;
        }

        int[] dp=new int[n + 1];

        dp[0] =1;

        for (int i=1;i<= n;i++) {

            long total =2L*dp[i - 1];

            if (prev[i]!=0) {
                total-=dp[prev[i] - 1];
            }

            dp[i] =(int)((total +mod) % mod);
        }

     return(dp[n]-1+mod)% mod;
    }
}