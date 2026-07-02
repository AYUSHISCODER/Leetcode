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
    public boolean isValidBST(TreeNode root) {
        fun(root);
        int n=ans.size();
        for(int i=0;i<n-1;i++){
            if(ans.get(i)>=ans.get(i+1)){
                return false;
            }

        }
        return true;
    }
    ArrayList<Integer> ans=new ArrayList<>();
    public void fun(TreeNode root){
        if(root==null){
            return ;
        }
        
       fun(root.left);
       ans.add(root.val);
       fun(root.right);

    }
}