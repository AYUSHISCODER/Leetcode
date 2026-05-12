class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int high=0;high<n;high++){
            int f= fruits[high];
            map.put(f,map.getOrDefault(f,0)+1);
        
        while(map.size()>2){
            int left=fruits[low];
            map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                map.remove(left);
            }
            low++;
        }
         res=Math.max(res,high-low+1);
    }
    return res;
}}