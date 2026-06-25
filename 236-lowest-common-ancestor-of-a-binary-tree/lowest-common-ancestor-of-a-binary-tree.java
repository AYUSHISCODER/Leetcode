/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        fun(root,p,q);
        return ans;
    }
    public int fun(TreeNode root,TreeNode p,TreeNode q){
        int total=0;
        if(root==null){
            return total;
        }
        int left=fun(root.left,p,q);
        int right=fun(root.right,p,q);
        int self=0;
        if(root==p || root==q){
         self=1;
        }
     total=self+left+right;
        if(total==2 && ans==null){
            
            ans=root;
        }
        return total;

    }
}