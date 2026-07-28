class Solution {
    HashMap<Integer,Integer> dp=new HashMap<>();
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        int a=fib(n-1);
        int b=fib(n-2);
        int ans=a+b;
        dp.put(n,ans);
        return ans;
      
    }
}