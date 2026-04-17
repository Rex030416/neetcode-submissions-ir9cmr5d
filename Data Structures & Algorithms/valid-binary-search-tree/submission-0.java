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
        if(root==null){
            return false;
        }
        return DFS(root);
        
        }

        private boolean DFS(TreeNode root){
            if(root.left==null&&root.right==null){
                return true;
            }
            if(root.left==null&&root.right.val<root.val){
                return false;
            }

            if(root.right==null&&root.left.val>root.val){
                return false;
            }
            if(root.right.val<root.val||root.right.val>root.val){
                return false;
            }
           
            return DFS(root.left)&&DFS(root.right);
        }
    }

