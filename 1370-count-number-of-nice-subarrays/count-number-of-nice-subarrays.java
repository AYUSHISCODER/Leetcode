class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
     
}
  public int fun(int[]nums,int k){
    int left=0;
    int count=0;
    int odd=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int right=0;right<nums.length;right++){
      map.put(nums[right],map.getOrDefault(nums[right],0)+1);
      if(nums[right]%2 !=0){
        odd++;
      }
      while(odd>k){
        map.put(nums[left],map.get(nums[left])-1);
        if(nums[left]%2!=0){
            odd--;
        }
        left++;
      }
      count+=right-left+1;

    }
    return count;
  }
 
}