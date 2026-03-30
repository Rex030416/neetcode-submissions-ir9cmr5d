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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> helper=new ArrayDeque<>();
        helper.push(root);
        while(!helper.isEmpty()){
            List<Integer> curRes=new ArrayList<>();
            int len=helper.size();
            for(int i=0;i<len;i++){
                TreeNode tmp=helper.pollFirst();
                curRes.add(tmp.val);
                if(tmp.left!=null){
                    helper.addLast(tmp.left);
                }
                if(tmp.right!=null){
                    helper.addLast(tmp.right);
                }
            }

            res.add(curRes);
        }
        return res;
    }
}
