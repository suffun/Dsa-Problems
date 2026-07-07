class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long x = 0;
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (ch != '0') {
                int num = ch - '0';
                x = x * 10 + num;
                sum += num;
            }
        }
        return x * sum;
    }
}