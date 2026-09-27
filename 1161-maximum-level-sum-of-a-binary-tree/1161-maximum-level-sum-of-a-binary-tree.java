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
    int maxV = Integer.MIN_VALUE;
    int maxL = 0;
    public int maxLevelSum(TreeNode root) {

    if(root == null) return 0;
    
    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);

    helper(root, q, 0);

    return maxL;
        
    }
    void helper(TreeNode root, Queue<TreeNode> q, int level)
    {
       if(root == null) return;

       while(!q.isEmpty())
       {
            int size = q.size();
            int total = 0;
            level++;

            for(int i = 0 ; i < size ; i++)
            {
                TreeNode value = q.poll();
                if(value.left != null) q.add(value.left);
                if(value.right != null) q.add(value.right);

                total += value.val;
            }
            if(total > maxV)
            {
                maxV = total;
                maxL = level;
            }
       }
    }
}