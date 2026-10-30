class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        return check(0,0,0,grid);
    }
    public boolean check(int num,int row,int col, int[][] grid){
        int n = grid.length;
        if(grid[row][col] == n*n-1) return true;
        // top
        int i,j;
        i = row-2;
        j = col-1;
        if(i>=0 && j >=0 && grid[i][j] == num+1) return check(num+1,i,j,grid);
        i = row-2;
        j = col+1;
        if(i>=0 && j <n && grid[i][j] == num+1) return check(num+1,i,j,grid);
        // down
        i = row+2;
        j = col-1;
        if(i<n && j >=0 && grid[i][j] == num+1) return check(num+1,i,j,grid);
        i = row+2;
        j = col+1;
        if(i<n && j <n && grid[i][j] == num+1) return check(num+1,i,j,grid);
        // left
        i = row+1;
        j = col-2;
        if(i<n && j >=0 && grid[i][j] == num+1) return check(num+1,i,j,grid);
        i = row-1;
        j = col-2;
        if(i>=0 && j >=0 && grid[i][j] == num+1) return check(num+1,i,j,grid);
        // right
        i = row+1;
        j = col+2;
        if(i<n && j <n && grid[i][j] == num+1) return check(num+1,i,j,grid);
        i = row-1;
        j = col+2;
        if(i>=0 && j <n && grid[i][j] == num+1) return check(num+1,i,j,grid);
        return false;

    }
}