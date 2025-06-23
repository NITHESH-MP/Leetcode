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
class Solution 
{
    List<String> result = new ArrayList<>();
    String path = "";
    public List<String> binaryTreePaths(TreeNode root) 
    {        
        traverse(root,path);

        return result;
    }

    public void traverse(TreeNode root, String path)
    {
        if(root==null)
            return;
        
        path+=root.val;

        if(root.left == null && root.right == null)
        {
            result.add(path);
            return ;
        }

        path += "->";

        traverse(root.left,path);
        traverse(root.right,path);
    }
}