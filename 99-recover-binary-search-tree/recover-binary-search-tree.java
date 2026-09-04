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
    public void recoverTree(TreeNode root) {

        List<TreeNode> nodes = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        inorderCollect(root, nodes, values);
        Collections.sort(values);

        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).val = values.get(i);
        }
    }
    
    private void inorderCollect(TreeNode node, List<TreeNode> nodes, List<Integer> values) {
        if (node == null) return;
        
        inorderCollect(node.left, nodes, values);
        
        nodes.add(node);
        values.add(node.val);
        
        inorderCollect(node.right, nodes, values);
    }
}