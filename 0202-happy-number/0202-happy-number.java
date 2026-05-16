class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow= sum(slow);
            fast=sum(fast);
            fast=sum(fast);

            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;}
        
        public static int sum(int n){
            int ans=0;
            while(n>0){
                int rem =n%10;
             n=n/10;
             ans=ans+rem*rem;
            }

            return ans;
        }

    

}