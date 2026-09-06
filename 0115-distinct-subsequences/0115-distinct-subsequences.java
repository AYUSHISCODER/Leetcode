class Solution {
    Integer dp[][];
    public int numDistinct(String s, String t) {
        dp=new Integer[s.length()+1][t.length()+1];
        return fun(s,t,0,0);
    }
    public int fun(String s,String t,int i,int j){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=fun(s,t,i+1,j+1)+fun(s,t,i+1,j);
        }
        else{
            return dp[i][j]= fun(s,t,i+1,j);
        }
    }
}