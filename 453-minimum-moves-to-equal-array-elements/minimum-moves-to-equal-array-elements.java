class Solution {
    public int minMoves(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for(int ele : arr){
            smallest = Math.min(ele,smallest);
        }
        int ans = 0;
        for(int ele : arr){
            ans += ele - smallest;
        }
        return ans;
    }
}