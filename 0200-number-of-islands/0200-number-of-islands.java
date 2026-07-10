class Solution {
    int[] x = {-1,1,0, 0};
    int[] y = {0,0,-1, 1};

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
     for (int j = 0; j < n; j++) {
                if(grid[i][j] =='1' && !visited[i][j]) {
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }

        return count;
    }
public void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
            if (grid[i][j] == '0' || visited[i][j])
            return;

        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int ni = i + x[k];
            int nj = j + y[k];
            dfs(grid, visited, ni, nj);
        }
    }
}