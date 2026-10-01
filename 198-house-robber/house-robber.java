class Solution {
    static int[] dp;
    public int rob(int[] arr) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return robber(0,arr);
    }
    public int robber(int i,int[] arr){
        if(i>=arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = arr[i]+robber(i+2,arr);
        int skip = robber(i+1,arr);
        return dp[i] = Math.max(pick,skip);
    }
}