class Solution {
    static int[][] dp;
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        dp = new int[m][n];
        for(int[] rows :dp){
            Arrays.fill(rows,-1);
        }
        StringBuilder s1 = new StringBuilder(word1);
        StringBuilder s2 = new StringBuilder(word2);
        return minDist(m-1,n-1,s1,s2);
    }
    public int minDist(int i,int j,  StringBuilder s1,StringBuilder s2){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = minDist(i-1,j-1,s1,s2);
        int replace = 1+ minDist(i-1,j-1,s1,s2);
        int remove = 1+ minDist(i-1,j,s1,s2);
        int insert = 1+ minDist(i,j-1,s1,s2);
        return dp[i][j] = Math.min(replace,Math.min(remove,insert));
    }
}