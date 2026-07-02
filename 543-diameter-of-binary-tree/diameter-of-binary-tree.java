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

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
     public maxDiameter = 0;
        getHeight(root);
        return maxDiameter;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

       maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
 */

class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxDiameter;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
