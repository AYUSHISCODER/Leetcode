class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        ArrayList<Integer> help1=new ArrayList<>();
        ArrayList<Integer> help2=new ArrayList<>();
        help1.add(nums[0]);
        help2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(help1.get(help1.size()-1)>help2.get(help2.size()-1)){
                help1.add(nums[i]);
                
                    
                
            }
            else{
                help2.add(nums[i]);
            }

        }
        help1.addAll(help2);
        for(int i=0;i<n;i++){
            ans[i]=help1.get(i);
        }
        return ans;
    }
}