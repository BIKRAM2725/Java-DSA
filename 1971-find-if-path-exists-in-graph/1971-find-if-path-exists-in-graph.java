// BFS

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

    List<List<Integer>> graph = new ArrayList<>();

    for(int i = 0 ; i < n ; i++)
    {
        graph.add(new ArrayList<>());
    }

    for(int[] temp : edges)
    {
        int u = temp[0];
        int v = temp[1];

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    Queue<Integer> q = new LinkedList<>();

    boolean[] arr = new boolean[n];

    q.add(source);
    arr[source] = true; 

    while(!q.isEmpty())
    {
        int data = q.poll();

        for(int i : graph.get(data))
        {
            if(!arr[i])
            {
                arr[i] = true;
                q.add(i);
            }
        }  
    }

    if(!arr[destination]) return false;

    return true;
        
    }
}