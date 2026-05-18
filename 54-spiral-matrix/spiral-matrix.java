class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;

        int total = m * n;

        while (ans.size() < total) {

            // → Traverse right (top row)
            for (int j = firstCol; j <= lastCol; j++) {
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if (ans.size() >= total) break;

            // ↓ Traverse down (right column)
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if (ans.size() >= total) break;

            // ← Traverse left (bottom row)
            for (int j = lastCol; j >= firstCol; j--) {
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if (ans.size() >= total) break;

            // ↑ Traverse up (left column)
            for (int i = lastRow; i >= firstRow; i--) {
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }

        return ans;
    }
}