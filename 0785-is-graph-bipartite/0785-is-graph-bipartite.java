class Solution {
    boolean res=true;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        for(int i=0;i<n;i++){
            color[i]=-1;
        }
        int node=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                dfs(graph,color,i,c);
            }
        }
        return res;

    }
    public void dfs(int[][] graph,int[]color,int node,int c){
        color[node]=c;
        for(int i=0;i<graph[node].length;i++){
            int neigh=graph[node][i];
            if(color[neigh]!=-1 && color[neigh]==c){
                res=false;
                return;
            }
            else if(color[neigh]==-1){
                dfs(graph,color,neigh,1-c);
            }

        }
    }

}