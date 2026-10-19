class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int low =0, hi = n-1;
        int idx = -1;
        List<Integer> ans = new ArrayList<>();
        while(low<=hi){
            int mid = (low+hi)/2;
            if(arr[mid] <target) low = mid+1;
            else if(arr[mid] > target) hi = mid-1;
            else {
                idx = mid;
                hi = mid-1;
            }
        }
        if(idx ==-1) return ans;
        while(idx<n && arr[idx] == target){
            ans.add(idx);
            idx++;
        }
        return ans;
    }
}