class Solution {
    int count=0;
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int pos=0;
        int num=0;
        int []freq=new int[10];
        for(int d: digits){
            freq[d]++;
        }
        fun(freq,pos,n,num);
        return count;

    }
    public void fun(int[]freq,int pos,int n,int num){
      if(pos==3 ){
        if(num%2==0){
            count++;
        }
        return;
      }
         

        for(int i=0;i<=9;i++){
        
        if(freq[i]==0){
            continue;
        }
        if(pos==0 && i ==0){
            continue;
        }
        freq[i]--;
        fun(freq,pos+1,n,num*10+i);
        freq[i]++;
         
        }
    }
}