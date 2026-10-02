class Solution {
    public int numIslands(char[][] grid) {

    int m = grid.length;
    int n = grid[0].length;
    int count = 0;

    boolean[][] vis = new boolean[m][n];

    for(int i = 0 ; i < m ; i++)
    {
        for(int j = 0 ; j < n ; j++)
        {
            if(grid[i][j] == '1' && !vis[i][j])
            {
                bfs(i,j,grid, vis, count);
                count++;
            }
        }
    }

    return count;
        
    }

    class pair{
         
        int row;
        int col;

        pair(int row, int col)
        {
            this.row = row;
            this.col = col;
        }
    }

    void bfs(int i, int j, char[][] grid, boolean[][] vis, int count)
    {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,j));
        vis[i][j] = true;

        while(!q.isEmpty())
        {
            pair data = q.remove();
            int row = data.row;
            int col = data.col;

            //top 

            if(row > 0)
            {
                if(vis[row-1][col] == false && grid[row-1][col] == '1')
                {
                    q.add(new pair(row-1, col));
                    vis[row-1][col] = true; 
                }

            }

            //down

            if(row < grid.length-1)
            {
                if(vis[row+1][col] == false && grid[row+1][col] == '1')
                {
                    q.add(new pair(row+1, col));
                    vis[row+1][col] = true; 
                }

            }

            //left 

            if(col > 0)
            {
                if(vis[row][col-1] == false && grid[row][col-1] == '1')
                {
                    q.add(new pair(row, col-1));
                    vis[row][col-1] = true; 
                }

            }

            //right

            if(col < grid[0].length-1)
            {
                if(vis[row][col+1] == false && grid[row][col+1] == '1')
                {
                    q.add(new pair(row, col+1));
                    vis[row][col+1] = true; 
                }

            }
        }

    }
}