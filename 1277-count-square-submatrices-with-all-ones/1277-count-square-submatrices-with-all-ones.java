class Solution {
    public int countSquares(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int count = 0;

        for(int i = 0 ; i  < row; i++)
        {
            for(int j = 0 ; j < col; j++)
            {
                

                if(i == 0 || j == 0)
                {
                    if(matrix[i][j] == 1)
                    {
                        count++;
                    }
                }
                else
                { 
                    int side1 = matrix[i][j-1];
                    int side2 = matrix[i-1][j];
                    int side3 = matrix[i-1][j-1];

                    if(matrix[i][j] == 1 )
                    {
                        matrix[i][j] += Math.min(side1, Math.min(side2,side3));
                        count += matrix[i][j];
                    }
                }
            }
        }
        return count;
        
    }
}