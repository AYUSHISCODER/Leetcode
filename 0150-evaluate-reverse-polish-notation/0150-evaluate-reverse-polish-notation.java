class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
         if(tokens[i].equals("*")){
            int n1=st.pop();
            int n2=st.pop();
            st.push(n1*n2);
         }
         else if(tokens[i].equals("+")){
            int n1=st.pop();
            int n2=st.pop();
            st.push(n1+n2);
         }
         else if(tokens[i].equals("-")){
            int n1=st.pop();
            int n2=st.pop();
            st.push(n2-n1);
         }
         else if(tokens[i].equals("/")){
            int n1=st.pop();
            int n2=st.pop();
            st.push(n2/n1);
         }
         else{
            int n1=Integer.parseInt(tokens[i]);
            st.push(n1);
         }
        }
        return st.peek();
    }
}