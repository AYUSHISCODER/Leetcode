class Solution {
    Integer dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int i=0;
        int j=0;
        dp=new Integer[m][n];
        return fun(obstacleGrid,i,j,m,n);

    }
    public int fun(int[][] obstacleGrid,int i,int j,int m,int n){
        if( obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        
         if(i<0 || i>=m || j<0|| j>=n){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(i==m-1  && j==n-1){
            return 1;
        }
       
        if(obstacleGrid[i][j]==1){
            return 0;
        }
        return  dp[i][j]=fun(obstacleGrid,i+1,j,m,n) + fun(obstacleGrid,i,j+1,m,n);
    }
}