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
    int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int tmp=dfs(root);
        return maxDiameter;
    }


    private int dfs(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftMax=dfs(root.left);
        int rightMax=dfs(root.right);
        maxDiameter = Math.max(maxDiameter, leftMax + rightMax);
        return Math.max(leftMax,rightMax)+1;
    }

    
}
