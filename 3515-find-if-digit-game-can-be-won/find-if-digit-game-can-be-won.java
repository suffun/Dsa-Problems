class Solution {
    public boolean canAliceWin(int[] nums) {
        int single =0;
        int dbl = 0;
        for(int ele : nums){
            if(ele <=9) single+=ele;
            else dbl += ele;
        }
        if(single != dbl) return true;
        else return false;
    }
}