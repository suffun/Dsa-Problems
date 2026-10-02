// class Solution {
//     public int uniquePaths(int m, int n) {
//         return paths(0,0,m-1,n-1);
//     }
//     public int paths(int cr, int cc, int lr, int lc) {
//         if(cr==lr && cc== lc) return 1;
//         if(cr>lr || cc>lc) return 0;
//         int right = paths(cr, cc+1,lr, lc);
//         int down = paths( cr+1,cc, lr,lc);
//         return right + down;
//     }
// }

class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        return paths(m,n);
}
public int paths(int m, int n){
    if(m ==1 || n==1) return 1;
    if(dp[m][n] != 0) return dp[m][n];
    return dp[m][n] = paths(m-1,n)+paths(m,n-1);

}
}