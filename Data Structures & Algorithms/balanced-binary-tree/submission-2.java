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
    public int h(TreeNode r) {
        if (r == null ) return 0 ; 
        int l = h(r.left);
        if (l == -1 ) return -1 ; 
        int ri = h(r.right);
        if (ri == -1 ) return -1 ; 
        if (Math.abs(l-ri) > 1 ) {
            return -1 ; 
        }
        return Math.max(l,ri)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return h(root) != -1 ; 
    }
}
