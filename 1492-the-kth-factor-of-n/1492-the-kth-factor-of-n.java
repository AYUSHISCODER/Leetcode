class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> fact=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                fact.add(i);
                
                if(n/i!=i){
                fact.add(n/i);
            }
            }
            
        }
        Collections.sort(fact);
        if(k>fact.size()){
            return -1;
        }
       
            int ans=fact.get(k-1);
    
        return ans;
    }
}