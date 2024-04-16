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
import java.util.ArrayList;

class Solution {
    int curr = 0;
    int max = 0;
    int currNum = 0;
    ArrayList<Integer> list = new ArrayList<>();
    
    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (root.val == currNum) {
            curr++;
        } else {
            currNum = root.val;
            curr = 1;
        }

        if (curr > max) {
            max = curr;
            list.clear(); 
            list.add(root.val); 
        } else if (curr == max) {
            list.add(root.val); 
        }

        dfs(root.right);
    }

    public int[] findMode(TreeNode root) {
        dfs(root);
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}

