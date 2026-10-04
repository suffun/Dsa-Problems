class Solution {
    Boolean[][] dp;
    public boolean checkValidString(String s) {
        int n = s.length();
        dp = new Boolean[n][n + 1];
        return check(0,0,s);
    }
    public boolean check(int i, int count, String s){
        if(count<0) return false;
        if(i == s.length()) return count == 0;
        if(dp[i][count] != null) return dp[i][count];

        char ch = s.charAt(i);
        if(ch == '(') return dp[i][count] = check(i+1,count+1,s);
        else if(ch == ')') return dp[i][count] = check(i+1,count-1,s);
        else return dp[i][count] = check(i+1,count+1,s) || check(i+1,count-1,s) || check(i+1,count,s);
    }
}