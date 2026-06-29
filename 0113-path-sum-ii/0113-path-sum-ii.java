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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> help=new ArrayList<>();
        int sum=0;
        fun(ans,help,root,targetSum,sum);
        return ans;
    }
    public void fun(List<List<Integer>>ans, List<Integer> help, TreeNode root, int targetSum,int sum){
     
    //  if(sum==targetSum){
    //     ans.add(new ArrayList<>(help));
    //     return;
    //  }
    if(root==null){
        return;
    }
     help.add(root.val);
     sum=sum+root.val;
     if(root.left==null && root.right==null){
        if(sum==targetSum){
            ans.add(new ArrayList<>(help));
        
        }
     }
     
     fun(ans,help,root.left,targetSum,sum);
     fun(ans,help,root.right,targetSum,sum);
     help.remove(help.size()-1);
     
     



    }
}