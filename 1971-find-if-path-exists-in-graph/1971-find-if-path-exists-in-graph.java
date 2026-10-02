class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

    boolean[] arr = new boolean[n];

    Queue<Integer> q = new LinkedList<>();

    List<List<Integer>> graph = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        graph.add(new ArrayList<>());
    }

    for (int[] edge : edges) {

    int u = edge[0];
    int v = edge[1];

    graph.get(u).add(v);
    graph.get(v).add(u);
    }

    q.add(source);

    return bfs(q, arr, graph, destination, n);
        
    }

    boolean bfs(Queue<Integer> q, boolean[] arr, List<List<Integer>> graph, int destination, int n)
    {
        boolean check = false;

        while(!q.isEmpty())
        {
            int data = q.poll();

            if(data == destination) return true;

            for(int i : graph.get(data))
            {
                if(!arr[i])
                {
                    arr[i] = true;
                    q.add(i);
                }
            }
        }
        return false;
    }
}