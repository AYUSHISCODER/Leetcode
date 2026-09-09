class Solution {
    public long countCommas(long n) {
        long res=0;
        long lower=1000;
        long comma=1;
        long upper=0;
        long count=0;
        while(lower<=n){
            upper=lower*1000-1;
            if(upper>n){
                upper=n;
            }
            count=upper-lower+1;
            res+=count*comma;
            comma++;
            lower=lower*1000;
        }
        return res;
    }
}