class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int i=0;
        int j=0;
        dp=new Integer[m+1][n+1];
               return fun(text1,text2,m,n,i,j);
    }
    public int fun(String text1,String text2,int m,int n,int i,int j){
        if(i==m || j==n){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]= 1+fun(text1,text2,m,n,i+1,j+1);
        }
        int c1=fun(text1,text2,m,n,i,j+1);
        int c2=fun(text1,text2,m,n,i+1,j);
        return dp[i][j]= Math.max(c1,c2);
    }
}