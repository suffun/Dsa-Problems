class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}