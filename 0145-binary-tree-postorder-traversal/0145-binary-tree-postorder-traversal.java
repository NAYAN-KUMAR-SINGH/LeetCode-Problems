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
    public List<Integer> postorderTraversal(TreeNode root) {
             ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }     
       postorderTraversalRecursive(root, list);        
        return list;
    }
    
    private void postorderTraversalRecursive(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postorderTraversalRecursive(node.left, list);        
        postorderTraversalRecursive(node.right, list);
        list.add(node.val);
    }
}