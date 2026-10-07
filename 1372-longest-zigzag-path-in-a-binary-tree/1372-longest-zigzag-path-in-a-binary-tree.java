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

    int count = 0;

    public int longestZigZag(TreeNode root) {

    if(root == null) return 0;

    helper(root, false, 0);
    helper(root, true, 0);

    return count;
        
    }
    void helper(TreeNode root, boolean left, int check)
    {
        if(root == null) return;

        count = Math.max(count, check);

        if(!left)
        {
            helper(root.left, true, check + 1);
            helper(root.right, false, 1);
        }
        
        if(left)
        {
            helper(root.right, false, check + 1);
            helper(root.left, true, 1);
        }
    }
}