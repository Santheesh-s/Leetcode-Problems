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
        List<Integer> ls = new ArrayList<>();
        postorderHelper(root, ls); 
        return ls;
    }

    private void postorderHelper(TreeNode root, List<Integer> ls) {
        if (root == null) {
            return;
        }
        postorderHelper(root.left, ls);
        postorderHelper(root.right, ls);
        ls.add(root.val);
    }
}