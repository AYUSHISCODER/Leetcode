class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int [n];
        for(int i=0;i<n;i++){
            ans[i]=prices[i];
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    int amt= prices[i]-prices[j];
                    ans[i]=amt;
                    break;
                }
               
            }
        }
        return ans;

    }
}