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
    
    public int binaryToDecimal(StringBuilder binary) {
        int decimal = 0;
        int n = binary.length();

        for (int i = 0; i < n; i++) {
            int digit = binary.charAt(i) - '0'; // Convert char to int (0 or 1)
            decimal += digit * Math.pow(2, n - 1 - i);
        }

        return decimal;
    }

    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeafHelper(root, new StringBuilder());
    }
    
    private int sumRootToLeafHelper(TreeNode root, StringBuilder currentPath) {
        if (root == null) {
            return 0;
        }
        
        currentPath.append(root.val);
        
        if (root.left == null && root.right == null) {
            return binaryToDecimal(currentPath);
        }
        
     int sum = sumRootToLeafHelper(root.left, new StringBuilder(currentPath)) + 
                 sumRootToLeafHelper(root.right, new StringBuilder(currentPath));
        
   
        
        return sum;
    }
}
