class Solution {
    public int arrangeCoins(int n) {
        long lo = 1, hi = n;
        long ans = 0;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            long coins = mid*(mid+1)/2;
            if(coins<=n){
                ans= mid;
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }

        }
         return (int)ans;
    }
}