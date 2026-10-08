class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        return LCS(a,b);

    }

    public int LCS(StringBuilder s1, StringBuilder s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }
        return lcs(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
        
    }
    public int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) ==b.charAt(j)) return dp[i][j] =  1 + lcs(i-1,j-1,a,b,dp);
        else return dp[i][j] =  Math.max(lcs(i-1,j,a,b,dp),lcs(i,j-1,a,b,dp));
    }
}