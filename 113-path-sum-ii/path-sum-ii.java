
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        dfs(root,ans,arr,targetSum);
        return ans;
    }
    public void dfs(TreeNode root, List<List<Integer>> ans, List<Integer> arr, int targetSum){
        if(root == null) return;
        arr.add(root.val);
        if(root.left == null && root.right == null){
            if(targetSum==root.val){
                ans.add(new ArrayList<>(arr));
            }
        }
        dfs(root.left,ans,arr,targetSum-root.val);
        dfs(root.right,ans,arr,targetSum-root.val);
        arr.remove(arr.size()-1);
    }
}