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
    public boolean checkTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean leftSumTree = checkTree(root.left);
        boolean rightSumTree = checkTree(root.right);
     
        int leftSum = (root.left == null) ? 0 : root.left.val;
        int rightSum = (root.right == null) ? 0 : root.right.val;
        
  
        boolean isSumTree = (root.val == leftSum + rightSum);
        
        return isSumTree && leftSumTree && rightSumTree;
    }
}
