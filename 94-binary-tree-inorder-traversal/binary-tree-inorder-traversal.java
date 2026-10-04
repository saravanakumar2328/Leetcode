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
    List<Integer> l1=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return l1;

        
    }
    public void inorder(TreeNode rr){
        if(rr!=null){
            inorder(rr.left);
            l1.add(rr.val);
            inorder(rr.right);
        }
    }
}