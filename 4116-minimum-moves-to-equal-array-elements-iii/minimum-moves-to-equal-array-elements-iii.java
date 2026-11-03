class Solution {
    public int minMoves(int[] arr) {
         int largest = Integer.MIN_VALUE;
        for(int ele : arr){
            largest = Math.max(ele,largest);
        }
        int ans = 0;
        for(int ele : arr){
            ans += largest - ele;
        }
        return ans;
    }
}