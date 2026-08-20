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
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder = Arrays.copyOf(preorder,preorder.length);
        Arrays.sort(inorder);
        int n = preorder.length;
       
        return build(0,n-1,0,n-1,preorder,inorder);
    }
    public static TreeNode build(int preLo, int preHi,int inLo, int inHi, int[] preorder, int[] inorder){
        if(preLo >preHi || inLo >inHi) return null;
        int val = preorder[preLo];
        TreeNode root = new TreeNode(val);

        int r = -1;
        for(int i = inLo; i<= inHi; i++){
            if(inorder[i] == val ){
                r = i;
                break;
            }

        }

        int count = r - inLo;
        root.left = build(preLo+1,preLo+count,inLo,r-1,preorder,inorder);
        root.right = build(preLo+count+1,preHi,r+1,inHi,preorder,inorder);
        return root;
}
}