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
    public int dfs(TreeNode r , int maxSoFar) {
        if (r == null ) return 0 ; 
        int count = 0 ; 
        if (r.val >= maxSoFar) {
            count = 1 ; 
        }
        maxSoFar = Math.max(maxSoFar , r.val) ; 
        count += dfs(r.left,maxSoFar);
        count += dfs(r.right , maxSoFar);
        return count ; 
    }
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
}
