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
        
            list.add(root.val);       
        
        list.addAll(helper(root.left));
        list.addAll(helper(root.right));
        
        return list;
    }
    public boolean isUnivalTree(TreeNode root) {
     List<Integer> list = helper(root); 
        
     int temp = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(temp != list.get(i)){
                return false;
                
            }
        }
        
        return true;
    }
}