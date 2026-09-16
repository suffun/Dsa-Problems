class Solution {
    public int countDigits(int n) {
         int num = n;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (n % digit == 0)
                count++;

            num /= 10;
        }

        return count;
    }
}