class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans=new ArrayList<>() ;
       HashMap<String,List<String>> map=new HashMap<>();    

    
      int n=strs.length;
      for(int i=0;i<n;i++){
        String temp=strs[i];
        char a[]=strs[i].toCharArray();
        Arrays.sort(a);
       // List<String>t=new ArrayList<>(a.toString);
       String key=new String(a);
         if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
         }
         map.get(key).add(strs[i]);
        

      }
      return new ArrayList<>(map.values());
      
       
       
       
           }
}