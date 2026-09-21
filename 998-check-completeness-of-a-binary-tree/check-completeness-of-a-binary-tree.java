
class Solution {
    static int s;
    public boolean isCompleteTree(TreeNode root) {
        s = size(root);
        return isCBT(root,1);
    }
    public int size(TreeNode root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public boolean isCBT(TreeNode root, int idx){
        if(root == null) return true;
        if(idx > s) return false;
        return isCBT(root.left, 2*idx) && isCBT(root.right, 2*idx +1);
    }
}