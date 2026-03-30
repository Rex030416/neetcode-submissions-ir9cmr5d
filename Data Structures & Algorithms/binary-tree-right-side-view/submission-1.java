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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
     
        List<Integer> res=new ArrayList<>();
       
        Deque<TreeNode> helper=new ArrayDeque<>();
        helper.offerLast(root);
        while(!helper.isEmpty()){
            int size=helper.size();
            for(int i=0;i<size;i++){
                if(i==size-1){
                    TreeNode tmp=helper.pollFirst();
                    res.add(tmp.val);
                    if(tmp.left!=null){
                        helper.offerLast(tmp.left);
                    }
                     if(tmp.right!=null){
                        helper.offerLast(tmp.right);
                    }
                }else{
                    TreeNode tmp=helper.pollFirst();
                    if(tmp.left!=null){
                        helper.offerLast(tmp.left);
                    }
                     if(tmp.right!=null){
                        helper.offerLast(tmp.right);
                    }
                }
            }
        }

        return res;
    }
}
