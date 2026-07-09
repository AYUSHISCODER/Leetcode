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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return maptree(preorder,inorder);
    }
    HashMap<Integer,Integer>map=new HashMap<>();
    public TreeNode maptree(int[]preorder,int[]inorder){
    for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
    }
  return  fun(preorder,0,preorder.length-1);
    }
    int idx=0;
    public TreeNode fun(int[]preorder,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode node=new TreeNode(preorder[idx]);
        idx++;
        int id=map.get(node.val);
        node.left=fun(preorder,left,id-1);
        node.right=fun(preorder,id+1,right);
        return node;
    }

}