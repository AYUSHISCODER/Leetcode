class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int happy=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                happy+=customers[i];
            }
        }
        int left=0;
        int extra=0;
        int max=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
            extra=extra+customers[i];
            }
        }
        max=extra;
        for(int right=minutes;right<n;right++){
            if(grumpy[left]==1){
                extra=extra-customers[left];
            }
            left++;
            if(grumpy[right]==1){
                extra=extra+ customers[right];
            }
            max=Math.max(extra,max);
        }
        return max+happy;
    }
}