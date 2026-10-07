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
    List<Integer> l1=new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        innorder(root);
        int k=0;
        for(int i=0;i<l1.size()-1;i++){
            if(l1.get(i)<l1.get(i+1)){

            }
            else{
                k=1;
            }
        }
        if(k==0){
            return true;
        }
        else{
            return false;
        }

    }

    void innorder(TreeNode r) {
        if (r != null) {
            innorder(r.left);
            l1.add(r.val);
            innorder(r.right);
        }
        
    }

}