class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> fact=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                k--;
                if(k==0){
                    return i;
                }
                
                if(n/i!=i){
                fact.add(n/i);
            }
            }
            
        }
        for(int i=fact.size()-1;i>=0;i--){
            k--;
            if(k==0){
                return fact.get(i);
            }
        }
        return -1;
}}