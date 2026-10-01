class Solution {

    int count = 0;

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        
        boolean[] arr = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < n ; i++)
        {
            if(!arr[i])
            {
                q.add(i);
                arr[i] = true;
                helper(q, isConnected, arr);
                count++;
            }
        }

        return count;
    }
    void helper(Queue<Integer> q, int[][] isConnected, boolean[] arr)
    {
        while(!q.isEmpty())
        {
            int data = q.poll();

            for(int j = 0 ; j < isConnected.length ; j++)
            {
                if(isConnected[data][j] == 1 && !arr[j])
                {
                    arr[j] = true;
                    q.add(j);
                }
            }
        }
    }
}