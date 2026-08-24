class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minPrice=prices[0];
        int maxPrice=0;
        int profit=0;

        for(int i=0;i<n;i++){
           minPrice=Math.min(minPrice,prices[i]);
          int Maxprofit=prices[i]-minPrice;
           profit=Math.max(profit,Maxprofit);
        }
        return profit;

    }
}