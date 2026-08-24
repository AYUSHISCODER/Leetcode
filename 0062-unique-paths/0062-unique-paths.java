class Solution {
    Integer dp[][];
    public int uniquePaths(int m, int n) {
        int i=0;
        int j=0;
        dp=new Integer[m][n];
        return fun(i,j,m,n);
    }
    public int fun(int i,int j,int m,int n){
       
        if(i==m-1 || j==n-1){
            return dp[i][j]= 1;
        }
        if(i<0 || i>=m || j<0 || j>=n){
     return   dp[i][j]= 0;
        }
         if(dp[i][j]!=null){
            return dp[i][j];
        }

        return dp[i][j]= fun(i+1,j,m,n)+ fun(i,j+1,m,n);
    }
}