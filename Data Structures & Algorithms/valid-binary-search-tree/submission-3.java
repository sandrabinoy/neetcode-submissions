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
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean validateBST(TreeNode node, long left, long right) {
        if (node == null) return true;
        if (!(left < node.val && right > node.val)) return false;
        return validateBST(node.left, left, node.val) &&
                validateBST(node.right, node.val, right);
    }
}
