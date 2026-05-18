class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete= Integer.MIN_VALUE;
         int result=arr[0];
int n=arr.length;
         for(int i=1;i<n;i++){
            int prevnodelete=nodelete;
            int prevonedelete=onedelete;
            nodelete=Math.max(nodelete+arr[i],arr[i]);

            int v2=0;
            if(prevonedelete==Integer.MIN_VALUE){
                v2=arr[i];
            }
            else{

                v2=prevonedelete+arr[i];
            }

            onedelete=Math.max(v2,prevnodelete);
            result=Math.max(result,Math.max(onedelete,nodelete));
         }
        return result;
    }
}