class Solution {
   // Integer dp[];
    public int numSquares(int n) {
  int[]  dp=new int[n+1];
  dp[0]=0;
  for(int i=1;i<=n;i++){
  int ans=Integer.MAX_VALUE;
  for(int j=1;j*j<=i;j++){
ans =Math.min(ans,1+dp[i-j*j]);
  }
  dp[i]=ans;
  }
  return dp[n];
      
    }
//     public  int solve(int n){
//       if(n==0){
//             return 0;
//         }
//         if(dp[n]!=null){
//             return dp[n];
//         }
//         int ans=Integer.MAX_VALUE;
//         for(int i=1;i*i<=n;i++){
//          ans=  Math.min(ans,1+solve(n-i*i));
//         }
//   return dp[n]= ans;
//     }
}