// class Solution {
//     public boolean isPowerOfFour(int n) {
//         return n > 0 && (n & (n - 1)) == 0 &&  (n & 0x55555555) != 0;
//     }
// }
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        return (n & (n - 1)) == 0 && isSquare(n);
    }

    boolean isSquare(long n) {
        long root = (long) Math.sqrt(n);
        return root * root == n;
    }
}