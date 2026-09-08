class Solution {
    public int countCommas(int n) {
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        if(count>=4){
            return n-999;
        }
        return 0;

    }
}