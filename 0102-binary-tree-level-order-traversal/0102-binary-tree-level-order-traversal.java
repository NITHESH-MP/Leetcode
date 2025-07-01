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
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) 
    {    
        if(root == null)
            return ans;
        
        level(root,0);

        return ans;
    }

    public void level(TreeNode root, int level)
    {
        if(root == null)
            return;
        
        if(ans.size() == level)
            ans.add(new ArrayList<>());

        ans.get(level).add(root.val);

        level(root.left,level+1);
        level(root.right,level+1);

        
    }
}