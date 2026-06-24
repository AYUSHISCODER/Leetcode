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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
         boolean flag=false;
        
        while(!q.isEmpty()){
            int s=q.size();
                   

            ArrayList<Integer> help=new ArrayList<>();
             while(s-->0){
            TreeNode node=q.poll();
            if(flag==false){
            help.add(node.val);
            }
            else{
                help.add(0,node.val);
            }
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
            }
           
            flag=!flag;
        
             
             ans.add(help);

        }
        return ans;
    }
}