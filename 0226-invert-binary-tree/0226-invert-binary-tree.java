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

// // DFS

// class Solution {
//     public TreeNode invertTree(TreeNode root) {

//     if(root == null) return root;

//     if(root.left != null && root.right != null)
//     {
//         TreeNode temp = root.left;
//         root.left = root.right;
//         root.right = temp;
//     }

//     invertTree(root.left);
//     invertTree(root.right);

//     return root; 

//     }
// }


// BFS 

class Solution {
    public TreeNode invertTree(TreeNode root) {

    if(root == null) return root;

    Queue<TreeNode> q = new LinkedList<>();

    q.add(root); 

    while(!q.isEmpty())
    {
        TreeNode data = q.remove();

        TreeNode temp = data.left;
        data.left = data.right;
        data.right = temp;

        if(data.left != null) q.add(data.left);
        if(data.right != null) q.add(data.right);
    }

    return root;
    }
}
