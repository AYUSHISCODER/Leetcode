class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int temp1=n;
        int prod=1;
        while(temp1>0){
            sum=sum+ temp1%10;
            temp1=temp1/10;
        }
        while(n>0){
           prod=prod* (n%10);
           n=n/10;
        }
        return -(sum-prod);
    }
}