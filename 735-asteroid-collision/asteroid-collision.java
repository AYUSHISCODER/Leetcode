class Solution {
    public int[] asteroidCollision(int[]asteroids) {

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<asteroids.length;i++){

            int cur =asteroids[i];

            while(!st.isEmpty()&& cur<0 &&st.peek() > 0){

                if(st.peek() <-cur){
                    st.pop();
                }
                else if(st.peek() == -cur){
                    st.pop();
                    cur = 0;
                    break;
                }
                else{
                    cur = 0;
                    break;
                }
            }

            if(cur != 0){
                st.push(cur);
            }
        }

        int[] ans = new int[st.size()];

        for(int i=0;i<st.size();i++){
            ans[i] = st.get(i);
        }

        return ans;
    }
}