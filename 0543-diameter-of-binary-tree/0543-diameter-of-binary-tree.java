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

public static int hight(TreeNode root) {

    if(root == null)
        return 0;

    if(root.left == null && root.right == null)
        return 0;

    return 1 + Math.max(
        hight(root.left),
        hight(root.right)
    );
}

public static int helper(TreeNode root) {

    if(root == null)
        return 0;

    int leftHeight = hight(root.left);
    int rightHeight = hight(root.right);

    int diameterThroughRoot = leftHeight + rightHeight;

    if(root.left != null)
        diameterThroughRoot++;

    if(root.right != null)
        diameterThroughRoot++;

    int leftDiameter = helper(root.left);
    int rightDiameter = helper(root.right);

    return Math.max(
        diameterThroughRoot,
        Math.max(leftDiameter, rightDiameter)
    );
}

public int diameterOfBinaryTree(TreeNode root) {

    return helper(root);
}

}



// class Solution {
    
//     public static int height(TreeNode root)
//     {
//         if(root == null) return 0;

//         if(root.left == null && root.right == null) return 0;

//         return 1 + Math.max(height(root.left) , height(root.right));

//     }
//     public int diameterOfBinaryTree(TreeNode root) {

//     if(root == null ) return 0;
//     if(root.left == null && root.right == null) return 0;

//     int count = height(root.left) + height(root.right);

//     if(root.left != null) count++;

//     if(root.right != null) count++;

//     int leftdiameter = diameterOfBinaryTree(root.left);
//     int rightdiamer = diameterOfBinaryTree(root.right);

//     return Math.max(count, Math.max(leftdiameter, rightdiamer));
        
//     }
// }


