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
    
    Queue<TreeNode> que = new LinkedList<>();

    List<List<Integer>> arr = new ArrayList<>();

    levelorder(root, que, arr);

    return arr;

    }

   public void levelorder(TreeNode root, Queue<TreeNode> que, List<List<Integer>> arr) {
    {
        if(root == null) return;

        que.add(root);

        while(!que.isEmpty())
        {
            int size = que.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i < size; i++)
            {
                TreeNode a = que.poll();

                level.add(a.val);

                if(a.left != null) 
                {
                    que.add(a.left);
                }
                if(a.right != null) 
                {
                    que.add(a.right);
                }
            }
            arr.add(level);

        } 
    }
   }
}