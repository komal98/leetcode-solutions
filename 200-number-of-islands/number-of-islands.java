class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int r = grid.length;
        int c = grid[0].length;
        int numOfIslands = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1'){
                    numOfIslands++;
                    dfs(grid,i,j);
                }
            }
        }

        return numOfIslands;
    }

    void dfs(char[][] grid, int r, int c){
        int nr = grid.length;
        int nc = grid[0].length;

        if(r < 0 || r >=nr || c<0 || c>=nc || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}