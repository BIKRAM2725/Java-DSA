// // Dynamic Programming — Tabulation (Bottom-Up DP)

// class Solution {
//     public int uniquePaths(int m, int n) {

//         int ans = 0;

//         int[][] arr = new int[m][n];

//         for(int i = 0 ; i < m; i++)
//         {
//             for(int j = 0 ; j < n ; j++)
//             {
//                 if(i == 0 || j == 0)
//                 {
//                     arr[i][j] = 1;
//                 }
//                 else
//                 {
//                     arr[i][j] = arr[i][j-1] + arr[i-1][j];
//                 }
//             }
//         }
//         return arr[m-1][n-1];
        
//     }
// }


// Recurtion

class Solution {
    public int uniquePaths(int m, int n) {
       
       int[][] arr = new int[m][n];

       for(int i = 0 ; i < m ; i++)
       {
        for(int j = 0; j < n ; j++)
        {
            arr[i][j] = -1;

        }
       }

       return helper(0,0,m,n, arr);
        
    }

    public static int helper(int i, int j, int m, int n, int[][] arr)
    {
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;

        if(arr[i][j] != -1) return arr[i][j];

        int right = helper(i, j+1, m, n, arr); 
        int down = helper(i+1, j, m, n, arr);

        return arr[i][j] = right + down;

    }
}