class Solution {
    public int numIslands(char[][] grid) {
        // int i=0;
        // int j=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    dfs(grid,i,j,vis,m,n);
                    res++;
                }
            }
        }
        return res;
    }
    public boolean valid (int i,int j,int m,int n){
        if(i<0 ||i>=m||j<0||j>=n){
            return false;
        }
        return true;
    }
    int x[]={-1,1,0,0};
    int y[]={0,0,-1,1};
    public void dfs(char[][] grid,int i,int j,   boolean vis[][],int m ,int n){
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if(valid(row,col,m,n)&& grid[row][col]=='1' && vis[row][col]==false){
                dfs(grid,row,col,vis,m,n);
            }
          
        }
          return ;
    }
}