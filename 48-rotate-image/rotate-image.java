
class Solution {
    public void rotate(int[][] arr) {

        int n = arr.length;

        // Transpose
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //  Reverse each row
        for (int i = 0; i < n; i++) {

            int stCol = 0;
            int endCol = n - 1;

            while (stCol < endCol) {

                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;

                stCol++;
                endCol--;
            }
        }
    }
}