class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m = matrix[0].length;
        int ans[]=new int[n*m];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            ans[index++]=matrix[i][j];
        }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(ans[i]);
        }
        for(int i=k;i<m*n;i++){
            if(pq.peek()>ans[i]){
                pq.poll();
                pq.add(ans[i]);
            }
        }
        return pq.peek();
    }
}