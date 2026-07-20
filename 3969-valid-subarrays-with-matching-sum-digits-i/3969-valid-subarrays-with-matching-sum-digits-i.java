class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        long temp=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
            sum+=nums[j];
            //  temp=sum;
            temp=sum;
            long last=sum%10;
              long first=0;
           //   temp=sum;
              while(temp>=10){
              //  first=temp;
                temp=temp/10;
            
              }
              first=temp;
              if(first==x && last==x){
                count++;
              }
            }
        }
        return count;
    }
}