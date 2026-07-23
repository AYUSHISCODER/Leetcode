class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
         int temp=i;
         while(temp>0){
         int last=temp%10;
        
           if( last==0 || i%last!=0){
            break;
           }
           else{
            temp=temp/10;
           }
           if(temp==0){
            list.add(i);
           }


        }
    

    }
    return list;
    }
}