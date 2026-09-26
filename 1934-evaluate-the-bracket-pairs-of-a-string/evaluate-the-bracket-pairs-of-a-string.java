class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            String key=knowledge.get(i).get(0);
            String val=knowledge.get(i).get(1);
            map.put(key,val);
        }
        int n=s.length();
        String temp="";
        String ans="";
        int i=0;
        while(i<n){
        if(s.charAt(i)=='('){
            int id=i+1;
            while(s.charAt(id)!=')'){
                temp=temp+s.charAt(id);
                id++;
            }
           
            i=id;
            if(map.containsKey(temp)){
            ans=ans+map.get(temp);}
            else{
                ans=ans+'?';
            }
            temp="";
            
        }
        else{
        ans=ans+s.charAt(i); }
        i++;
    
        

        }
        return ans;
    }
}