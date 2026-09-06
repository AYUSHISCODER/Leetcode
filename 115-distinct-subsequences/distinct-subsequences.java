class Solution {
    Integer dp[][];
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        dp=new Integer[s.length()+1][t.length()+1];
        return fun(s,t,m,n);
    }
    public int fun(String s,String t,int m,int n){
        if(n==0){
            return 1;
        }
        if(m==0){
            return 0;
        }
        if(dp[m][n]!=null){
            return dp[m][n];
        }
        
        if(s.charAt(m-1)==t.charAt(n-1)){
            return dp[m][n]=fun(s,t,m-1,n-1)+fun(s,t,m-1,n);
        }
        else{
            return dp[m][n]= fun(s,t,m-1,n);
        }
    }
}