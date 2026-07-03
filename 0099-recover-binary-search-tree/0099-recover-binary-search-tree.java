/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        fun(root);
        int n=list.size();
      sort(list);
       replace(root);
    }
    ArrayList<Integer>list=new ArrayList<>();
    public void fun(TreeNode root){
        if(root==null){
            return ;
        }
        fun(root.left);
        list.add(root.val);
        fun(root.right);
    }
      int i=0;
    public void replace(TreeNode root){
      
      if(root==null){
        return;
      }
      replace(root.left);
      root.val=list.get(i++);
      replace(root.right);
    }
    public void sort(ArrayList<Integer>list){
        int wrong=0;
        int wrong1=-1,wrong2=-1,wrong3=-1,wrong4=-1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                if(wrong==0){
                    wrong1=i;
                    wrong2=i+1;
                    wrong++;
                }
                else{
                    wrong3=i;
                    wrong4=i+1;
                    wrong++;
                }
            }
        }
        if(wrong==1){
            swap(list,wrong1,wrong2);
            
        }
        else{
            swap(list ,wrong1,wrong4);
        }
        
    }
     public void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    



}