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
    int maxlen = 0;

    public int longestZigZag(TreeNode root) {
        int left = 0;
        int right = 0;

        helper(root.left, true, false, 1);
        helper(root.right, false, true, 1);

        return maxlen;
    }

    public void helper(TreeNode root, boolean left, boolean right,int count)
    {
        if(root == null)
            return ;
        
        maxlen = Math.max(maxlen, count);
        
        if(left)
        {
           helper(root.right, false, true, count + 1);

           helper(root.left, true, false, 1);
        }        
        else
        {
            helper(root.left, true, false, count + 1);

            helper(root.right, false, true, 1);
        }

    }
}