class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        int m = arr.length, n = arr[0].length;
        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {

            // Top row
            for (int j = firstCol; j <= lastCol; j++) {
                ans.add(arr[firstRow][j]);
            }
            firstRow++;

            // Right column
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(arr[i][lastCol]);
            }
            lastCol--;

            // Bottom row
            if (firstRow <= lastRow) {
                for (int j = lastCol; j >= firstCol; j--) {
                    ans.add(arr[lastRow][j]);
                }
                lastRow--;
            }

            // Left column
            if (firstCol <= lastCol) {
                for (int i = lastRow; i >= firstRow; i--) {
                    ans.add(arr[i][firstCol]);
                }
                firstCol++;
            }
        }

        return ans;
    }
}