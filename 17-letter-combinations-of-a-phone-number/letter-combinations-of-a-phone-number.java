class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans=new ArrayList<>();
        if(digits==null && digits.length()==0){
            return ans;
        }
        HashMap<Character,String> map=new HashMap<>();
      map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        int n=digits.length();
        int id=0;
        fun(digits,map,new StringBuilder(),ans,n,id);
        return ans;

    }
    public void fun(String digits,HashMap<Character,String>map, StringBuilder curr, ArrayList<String>ans,int n,int id){
        if(id==n){
            ans.add(curr.toString());
            return;
        }
        String choice=map.get(digits.charAt(id));
        for(int i=0;i<choice.length();i++){
            curr.append(choice.charAt(i));
            fun(digits,map,curr,ans,n,id+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }

}