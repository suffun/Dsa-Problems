class Solution {
    public boolean canAliceWin(int n) {
       int stoneReq = 10;
       boolean Alice = false;
       while(n >= stoneReq){
        n -= stoneReq;
        stoneReq--;
        Alice = !Alice;
       }
       return Alice;
    }
}