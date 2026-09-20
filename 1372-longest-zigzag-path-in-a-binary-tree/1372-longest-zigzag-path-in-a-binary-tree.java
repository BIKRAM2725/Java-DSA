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
    
    int maxStep = 0;

    public int longestZigZag(TreeNode root) {

        highest(root, 0 , true );
        highest(root, 0 , false);

        return maxStep;
        
    }

    void highest(TreeNode root, int step, boolean goleft)
    {
        if(root == null) return;

        maxStep = Math.max(maxStep, step);

        if(goleft == true)
        {
            highest(root.left, step + 1 , false);
            highest(root.right, 1 , true);
        }
        else
        {
            highest(root.right, step + 1 , true);
            highest(root.left, 1 , false);
        }

    }

}