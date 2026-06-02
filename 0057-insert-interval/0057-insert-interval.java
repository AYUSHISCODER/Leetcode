class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> temp=new ArrayList<>();
        boolean inserted=false;
        for(int[]nums: intervals){
            if(!inserted && nums[0]>=newInterval[0]){
                temp.add(newInterval);
                inserted=true;
            }
            temp.add(nums);
        }
        if(!inserted){
            temp.add(newInterval);
        }
        int[][]arr=temp.toArray(new int[temp.size()][]);
        ArrayList<int[]> res=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];
            if(end>=start2){
              end=Math.max(end,end2);
            }
            else{
                res.add(new int[]{start,end});
                start=start2;
                end=end2;
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);

    }

}