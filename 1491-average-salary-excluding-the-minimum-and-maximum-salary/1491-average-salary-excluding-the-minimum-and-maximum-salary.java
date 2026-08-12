class Solution {
    public double average(int[] salary) {
        double max=0;
        double sum=0;
        double min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
            sum=sum+salary[i];
        }
        sum=sum-max-min;
        double avg=sum/(salary.length-2);
        return avg;
    }
}