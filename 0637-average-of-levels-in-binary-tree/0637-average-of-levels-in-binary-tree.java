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
    public List<Double> averageOfLevels(TreeNode root) {

    List<Double> arr = new ArrayList<>();

    Queue<TreeNode> q = new LinkedList<>();

    q.add(root);

    while(!q.isEmpty())
    {
        double size = q.size();

        double sum = 0;

        for(int i = 0 ; i < size ; i++)
        {
            TreeNode data = q.poll();
            sum += data.val;

            if(data.left != null) q.add(data.left);
            if(data.right != null) q.add(data.right);
        }

        arr.add(sum/size);
    }   
    return arr; 
    }
}