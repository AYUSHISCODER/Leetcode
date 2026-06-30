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
    public int minDepth(TreeNode root) {
        
        return fun(root);
      

    }
    public int fun(TreeNode root){
          if(root==null){
            return 0;
        }
        if(root.left==null){
            return 1+fun(root.right);
        }
        if(root.right==null){
             return 1+fun(root.left);
        }
        int left=fun(root.left);

        int right=fun(root.right);
        return 1+ Math.min(left,right);
    }

}