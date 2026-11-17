class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0; i<n;i++){
            min = Math.min(min,arr[i]);
            int profit = arr[i] - min;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}