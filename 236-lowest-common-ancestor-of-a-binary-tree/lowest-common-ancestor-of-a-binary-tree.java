
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root==null) return null;
//         if(root.val == p.val || root.val == q.val) return root;
//         boolean pLiesInLeft = exists(root.left,p);
//         boolean qLiesInRight = exists(root.left,q);
//         if(pLiesInLeft && !qLiesInRight) return  lowestCommonAncestor(root.left,p,q);
//         else if(!pLiesInLeft && qLiesInRight) return  lowestCommonAncestor(root.right,p,q);
//         else return root;
//     }
//     public boolean exists(TreeNode root, TreeNode target){
//         if(root == null) return false;
//         if(root.val == target.val) return true;
//         return exists(root.left,target) || exists(root.right,target);
//     }
// }


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!= null) return root;
        return(l==null) ? r : l ;
    }
    
}