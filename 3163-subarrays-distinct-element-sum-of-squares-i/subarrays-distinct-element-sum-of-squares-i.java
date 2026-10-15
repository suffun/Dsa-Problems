class Solution {
    public int sumCounts(List<Integer> arr) {
        int ans = 0;
        int n = arr.size();
    
        for(int i =0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i; j<n; j++){
                set.add(arr.get(j));
                int size = set.size();
                ans +=size * size;
            }
        }
        return ans;
    }
}