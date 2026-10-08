class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int n=pushed.length;
        int id=0;
        for(int i=0;i<n;i++){
        int num=pushed[i];
        st.push(num);
        while(id<n && !st.isEmpty() && popped[id]==st.peek()){
            st.pop();
            id++;
        }
       

        }
        return st.isEmpty();
    }
}