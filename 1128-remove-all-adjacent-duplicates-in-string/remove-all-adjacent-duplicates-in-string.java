class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                continue;
            }
            else{
                if(st.peek()==c){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        int k=ans.length();
        String ans2="";
        for(int i=k-1;i>=0;i--){
            ans2+=ans.charAt(i);

        }
        return ans2;
        
    }
}