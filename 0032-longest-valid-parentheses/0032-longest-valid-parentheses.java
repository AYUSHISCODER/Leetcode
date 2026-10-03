class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int ans=Integer.MIN_VALUE;
     st.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }

            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                  ans=Math.max(ans,i-st.peek());
                }
            }
        }
        if(ans==Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}