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
        return isValidBST(root,null,null);
    }

    public boolean isValidBST(TreeNode root, Integer max, Integer min){
        if(root == null) return true;
        if((max!=null && root.val>=max) || (min!=null && root.val<=min )){
            return false;
        }

        return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
    }
}