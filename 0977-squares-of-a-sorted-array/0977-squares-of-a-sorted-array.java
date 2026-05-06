class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        List <Integer> neg=new ArrayList<>();
        List<Integer> pos=new ArrayList<>();
        for(int num: nums){
            if(num>=0){
            pos.add(num);

            }
           else{ neg.add(num);
        }}
        if(neg.size()==0){
            for(int i=0;i<n;i++){
                nums[i]=nums[i]*nums[i];
            }
            return nums;

        }
        if(pos.size()==0){
            for(int i=0;i<n;i++){
            neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
           int[] arr = new int[neg.size()];

for (int i = 0; i < neg.size(); i++) {
    arr[i] = neg.get(i);
}
return arr;

        }
        int i=0 ,j=0, id=0;
        int n1=neg.size();
        int n2=pos.size();
        int []res=new int[n1+n2];

        for(i=0;i<n1;i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);
        
        for(j=0;j<n2;j++){
            pos.set(j,pos.get(j)*pos.get(j));
        }

        i=0 ;j=0;
        while(i<n1 && j<n2){
            if(neg.get(i)<=pos.get(j)){
                res[id]=neg.get(i);
                i++;
                id++;
            }
            else{
                res[id]=pos.get(j);
                id++;
                j++;
            }
        }
        while(i<n1){
            res[id]=neg.get(i);
            i++;
            id++;
        }
        while(j<n2){
            res[id]=pos.get(j);
            j++;
            id++;
        }
return res;


        
    }
}