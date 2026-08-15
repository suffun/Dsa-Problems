class Solution {
    public void rotate(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i =0; i<m; i++){
            int stCol = 0, endCol = n-1;
            while(stCol<endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
        
    }
}