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
    
    int result = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        
        pathTraversal(root, 0);
        return result;
    }

    public void pathTraversal(TreeNode root, int decimal){
        if(root == null)
            return;
        
        decimal = decimal * 2 + root.val;

        if(root.left == null && root.right == null)
        {
            result += decimal;
            decimal = 0;
            return;
        }

        pathTraversal(root.left, decimal);
        pathTraversal(root.right, decimal);
    }
}