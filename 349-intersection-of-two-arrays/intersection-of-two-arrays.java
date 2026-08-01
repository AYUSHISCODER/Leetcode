class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      //  HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int n2: nums2){
            set2.add(n2);
        }
        for(int n1: nums1){
            if(set2.contains(n1)){
                ans.add(n1);
                set2.remove(n1);
            }
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}