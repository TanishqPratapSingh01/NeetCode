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
    public boolean isSametree(TreeNode r , TreeNode subr) {
        if (r == null && subr == null ) return true ; 
        if (r == null || subr == null ) return false ; 
        if (r.val != subr.val ) return false ; 
        return isSametree(r.left,subr.left) && isSametree(r.right,subr.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null ) return false ; 
        if (isSametree(root,subRoot)) return true ; 
        return isSubtree(root.left,subRoot) || isSubtree(root.right , subRoot) ; 
    }
}
