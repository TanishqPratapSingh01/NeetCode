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
    public void inorder(List<Integer> l , TreeNode root ) {
        if (root != null ) {
            inorder(l,root.left) ; 
            l.add(root.val) ; 
            inorder(l,root.right) ; 
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>() ; 
        inorder(l,root) ; 
        return l.get(k-1) ; 
    }
}
