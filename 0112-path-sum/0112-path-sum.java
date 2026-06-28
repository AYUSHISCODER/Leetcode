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
    public boolean hasPathSum(TreeNode root, int targetSum) {
     int sum=0;
     return fun(root,sum,targetSum);
    }
    int res=0;
    public boolean fun(TreeNode root,int sum,int targetSum){
        if(root==null){
            return false;
    }
sum=sum+root.val;
      if(root.left==null && root.right==null){
        res=sum;
        if(res==targetSum){
            return true;
        }

      }
     return  fun(root.left,sum,targetSum) ||
                               fun(root.right,sum,targetSum);
     
}}