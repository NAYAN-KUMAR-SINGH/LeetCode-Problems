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
   public List<Integer> helper(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        
        list.addAll(helper(root.left));
        list.addAll(helper(root.right));
        
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       
        
        List<Integer> list1 = helper(root1);
        List<Integer> list2 = helper(root2);
        
        return list1.equals(list2);
    }
}