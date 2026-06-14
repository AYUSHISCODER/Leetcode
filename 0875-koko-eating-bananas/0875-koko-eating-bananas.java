class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        int res=-1;
        for(int nums: piles){
            high=Math.max(high,nums);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            long time=fun(piles,n,mid);
            if(time>h){
                low=mid+1;
            }
            else{
                res=mid;

                high=mid-1;
                
            }
        }
        return res;
    }

    public long fun(int piles[],int n,int speed){
        long hour=0;
        for(int i=0;i<n;i++){
            hour +=piles[i]/speed;
            if(piles[i]%speed !=0){
                hour++;
            }
        }
        return hour;
    }
}