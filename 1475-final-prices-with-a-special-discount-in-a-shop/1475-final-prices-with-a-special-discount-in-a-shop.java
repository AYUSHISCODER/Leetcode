class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            ans[i]=prices[i];
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int index= st.pop();
                ans[index]=ans[index]-prices[i];
            }
            st.push(i);
        }
        return ans;
    }
}