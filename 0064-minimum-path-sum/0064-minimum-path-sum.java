// class Solution {
//     public int minPathSum(int[][] grid) {

//         int row = grid.length;
//         int col = grid[0].length;

//         int[][] dp = new int[row][col];

//         for(int i = 0 ; i < row ; i++)
//         {
//             for(int j = 0 ; j < col ; j++)
//             {
//                 dp[i][j] = -1;
//             }
//         }

//         return helper(0,0,row,col,grid,dp);
        
//     }

//     public static int helper(int i , int j, int row, int col, int[][] grid, int[][] dp)
//     {
//         if(i >= row || j >= col) return Integer.MAX_VALUE;
//         if( i == row-1 && j == col-1) return grid[i][j];

//         if(dp[i][j] != -1) return dp[i][j];

//         int right = helper(i,j+1,row,col,grid,dp);
//         int down = helper(i+1,j,row,col,grid,dp);


//         int min = Math.min(right, down);

//         if (min == Integer.MAX_VALUE)
//             return min;

//         return dp[i][j] = grid[i][j] + min;

//     }
// }


// DP — Tabulation (Bottom-Up)

class Solution {
    public int minPathSum(int[][] grid) {
    
    int row = grid.length;
    int col = grid[0].length;

    int[][] dp = new int[row][col];

    dp[0][0] = grid[0][0];

    for(int i = 0 ; i < row ; i++)
    {
        for(int j = 0 ; j < col ; j++)
        {
            if ( !(i == 0 && j == 0) )
            {

            if(j == 0)
            {
                dp[i][j] = grid[i][j] + dp[i-1][j];
            }
            else if(i == 0)
            {
                dp[i][j] = grid[i][j]+ dp[i][j-1];
            }
            else
            {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }

            }
        }
    }

    return dp[row-1][col-1];

    }
}