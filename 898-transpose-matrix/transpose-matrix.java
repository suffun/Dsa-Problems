class Solution {
    public int[][] transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] a = new int[col][row];

        for(int i = 0; i<a.length; i++){
          for(int j = 0; j<a[0].length; j++){
         
              a[i][j] = arr[j][i];
             
          }
      }

      return a;
    }
}