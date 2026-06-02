class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int index,
                           int[] nums,
                           List<Integer> path,
                           List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        // Include current element
        path.add(nums[index]);
        backtrack(index + 1, nums, path, ans);

        // Backtrack
        path.remove(path.size() - 1);

        // Exclude current element
        backtrack(index + 1, nums, path, ans);
    }
}