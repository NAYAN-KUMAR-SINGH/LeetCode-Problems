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
    public int findSum(TreeNode root, int[] count){
        if(root == null){
            return 0;
        }
        count[0]++;
        int ls = findSum(root.left, count);
        int rs = findSum(root.right,count);
        int sum = (root.val + ls + rs);
        
        return sum;
    }
    public int averageOfSubtree(TreeNode root) {
       if(root == null){
            return 0;
        }
        int result = 0;
        int[] count = new int[1];
        int sum = findSum(root, count);
        if(root.val == (sum / count[0])){
           result += 1;
        }       
     
        int ls = averageOfSubtree(root.left);
        int rs = averageOfSubtree(root.right);
       
        result += ls + rs;
        return result;
        
    }
}
