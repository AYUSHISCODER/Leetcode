class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
            return "";
        }
        StringBuilder str=new StringBuilder();

        while(sum>9){
         str.append('9');
         sum=sum-9;

        }
        str.append(sum);
        while(str.length()<num){
            str.append('0');
        }
        return str.toString();


    }
}