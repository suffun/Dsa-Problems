class Solution {
    public int[] singleNumber(int[] arr) {
        int xor =0;
        for(int ele : arr){
            xor ^=ele;
        }
        int mask = (xor & (xor -1)) ^ xor;
        int b1 = 0;
        int b2 = 0;
        for(int ele : arr){
            if((ele & mask )!= 0) b1 ^=ele;
            else b2 ^= ele;
        }
        if (b1 < b2) {
            return new int[]{b1, b2};
        } else {
            return new int[]{b2, b1};
        }
    }
}