class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        
        int dp[][]=new int[m+1][n+1];
        
         for(int i=0;i<m;i++){
            dp[i][n]=0;                    
    }
    for(int j=0;j<n;j++){
        dp[m][j]=0;
    }
    for(int i=m-1;i>=0;i--){
        for(int j=n-1;j>=0;j--){
            if(text1.charAt(i)==text2.charAt(j)){
                dp[i][j]=1+dp[i+1][j+1];

            }
            else{
                int c1=dp[i+1][j];
                int c2=dp[i][j+1];
                dp[i][j]=Math.max(c1,c2);
            }
        }
           
    }
     return dp[0][0];
    }


}