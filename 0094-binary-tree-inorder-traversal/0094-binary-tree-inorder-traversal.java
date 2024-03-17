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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }     
       inorderTraversalRecursive(root, list);        
        return list;
    }
    
    private void inorderTraversalRecursive(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorderTraversalRecursive(node.left, list);
        list.add(node.val);
        inorderTraversalRecursive(node.right, list);
    }
    
}