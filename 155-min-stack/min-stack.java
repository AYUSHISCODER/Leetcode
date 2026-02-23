class MinStack {
    Stack<Long> st=new Stack<>();
    long min=Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        long value=val;
        if(st.isEmpty()){
            min=val;
            
            st.push(value);
        }
        else{
            if(value>=min){
                st.push(value);
            }
            else{
                st.push(2*value-min);
                min=value;
            }
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        long x=st.peek();
        st.pop();
        if(x<min){
            min=2*min-x;
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
       long x=st.peek();
        if(min<=x){
            return (int) x;
        }
        return (int) min;
        
    }
    
    public int getMin() {
        
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */