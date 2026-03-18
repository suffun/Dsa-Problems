class Solution {
    public boolean searchMatrix(int[][] matrix, int tar) {
       int rows = matrix.length , cols = matrix[0].length;
       int lo = 0, hi = rows * cols - 1;
       while(lo<=hi){
        int mid = (lo + hi)/2;
        int midRow = mid/cols, midCol = mid % cols;
        if(matrix[midRow][midCol] == tar) return true;
        else if(matrix[midRow][midCol] > tar) hi = mid - 1;
        else{
           lo = mid + 1;
        }

       } 
        return false;
    }
}