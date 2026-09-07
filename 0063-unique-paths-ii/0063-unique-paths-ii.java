class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    
    int row = obstacleGrid.length;
    int col = obstacleGrid[0].length;

    int[][] dp = new int[row][col];

    for(int i = 0 ; i < row ; i++)
    {
        for(int j = 0 ; j < col ;j++)
        {
            dp[i][j] = -1;

        }
    }

    if(obstacleGrid[0][0] == 1 || obstacleGrid[row-1][col-1] == 1 ) return 0;

    return helper(0,0,row, col,obstacleGrid, dp);
        
    }

    public static int helper(int i, int j, int row, int col, int[][] obstacleGrid, int[][] dp)
    {
        int ans = 0;

       
        if(i >= row || j >= col) return 0;
        if (obstacleGrid[i][j] == 1) return 0;
        if(i == row-1 && j == col-1) return 1;

        if(dp[i][j] != -1) return dp[i][j];
        
        int right = helper(i,j+1,row,col,obstacleGrid,dp);
        int down = helper(i+1,j,row,col,obstacleGrid,dp);
            
        return dp[i][j] = right + down;
           
    }
}