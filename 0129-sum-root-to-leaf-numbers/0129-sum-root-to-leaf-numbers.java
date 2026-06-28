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
    public int sumNumbers(TreeNode root) {
        return fun(root,0);
    }
    int res=0;
   
    public int fun(TreeNode root,int sum){
        
        if(root==null){
            return res;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            res+=sum;
        }
        fun(root.left,sum);
         fun(root.right,sum);
         return res;
    
    }
}