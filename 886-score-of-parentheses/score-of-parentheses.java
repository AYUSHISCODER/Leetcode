class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
       
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            st.push(0);
        }
        else{

            int val=st.pop();
            if(val==0){
                val=1;
            }
            else{
             val=val*2;}
          
        st.push(st.pop() +val);
            
        }
        }
        
       
 return st.pop();

        
    }
        
        
            }
