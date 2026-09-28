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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

     List<List<Integer>> arr = new ArrayList<>();

    Queue<TreeNode> q = new LinkedList<>();

    if(root == null) return arr;

    q.add(root);

    boolean left = true;

    while(!q.isEmpty())
    {
        int size = q.size();

        List<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i < size; i++)
        {
            TreeNode data  = q.poll();

            temp.add(data.val);

            if(data.right != null) q.add(data.right);
            if(data.left != null) q.add(data.left);                
        }

        if(left)
        {
            Collections.reverse(temp);
            left = false;
        }
        else
        {
            left = true;
        }

        arr.add(temp);
    }

    return arr;
        
    }
}