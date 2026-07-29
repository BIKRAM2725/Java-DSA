class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        
    int rows = maze.length;
    int cols = maze[0].length;

    Queue<int[]> q = new LinkedList<>();

    q.offer(new int[]{entrance[0],entrance[1]});

    maze[entrance[0]][entrance[1]] = '+';

    int[][] dir = {
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}
    };

    int steps = 0;

    while(!q.isEmpty())
    {
        int Qsize = q.size();

        for(int i = 0 ; i < Qsize ; i++)
        {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for(int[] d : dir)
            {
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nr >= rows || nc < 0 || nc >= cols)
                {
                    continue;
                }

                if(maze[nr][nc] == '+')
                {
                    continue;
                }

                if(nr == 0 || nc == 0 || nr == rows-1 || nc == cols-1)
                {
                    return steps + 1;
                }
                maze[nr][nc] = '+';

                q.offer(new int[]{nr,nc});
            }
        }
        steps++;

    }

    return -1;


    }
}


