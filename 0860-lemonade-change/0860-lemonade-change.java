class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
        int twenty=0;
        int n=bills.length;
        for(int i=0;i<n;i++){
            int amt=bills[i];
            if(amt==10){
                if(five==0){
                    return false;
                }
                else{
                    five--;
                }
                ten++;
            }
            else if(amt==20){
             if(five==0){
                return false;
             }
             if(ten!=0){
            
                ten--;
                five--;
                
             }
             else if(five<3){
                return false;
             }
             else{
                five=five-3;
             }
            }
            else{
                five++;
            }
        }
        return true;
    }
}