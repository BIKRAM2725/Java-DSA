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
    public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> arr = new ArrayList<>();

    Queue<TreeNode> q = new LinkedList<>();

    if(root == null) return arr;

    q.add(root);

    while(!q.isEmpty())
    {
        int size = q.size();

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i < size ; i++)
        {
            TreeNode data = q.poll();

            temp.add(data.val);

            if(data.left != null) q.add(data.left);
            if(data.right != null) q.add(data.right);
        }

        arr.add(temp);
    }
    return arr; 
    }
}