class Solution {
    public int findCircleNum(int[][] isConnected) {

    int n = isConnected.length;

    int count = 0;

    boolean[] arr = new boolean[n];

    Queue<Integer> q = new LinkedList<>();


    for(int i = 0 ; i < n ; i ++)
    {
        if(!arr[i])
        {
            q.add(i);
            bfs(isConnected, count, arr , q);
            count++;
        }

    }

    return count;
        
    }

    void bfs(int[][] isConnected, int count, boolean[] arr, Queue<Integer> q)
    {
        int n = isConnected.length;

        while(!q.isEmpty())
        {
            int data = q.poll();

            for(int j = 0; j < n; j++)
            {
                
                if(arr[j] == false && isConnected[data][j] == 1)
                {
                    arr[j] = true;
                    q.add(j);
                }
            }
        }
    }
}