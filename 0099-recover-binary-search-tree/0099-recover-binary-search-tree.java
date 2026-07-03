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
       Collections.sort(list);
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

}