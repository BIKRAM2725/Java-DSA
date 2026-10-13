// class Solution {
//     public int minReorder(int n, int[][] connections) {

//     List<List<int[]>> graph = new ArrayList<>();

//     for(int i = 0 ; i < n ; i++)
//     {
//         graph.add(new ArrayList<>());
//     }

//     for(int[] edge : connections)
//     {
//         int u = edge[0];
//         int v = edge[1];

//         graph.get(u).add(new int[]{v, 1});
//         graph.get(v).add(new int[]{u, 0});
//     }

//     boolean[] arr = new boolean[n];
//     Queue<Integer> q = new LinkedList<>();

//     q.add(0);
//     arr[0] = true;

//     int count = 0;

//     while(!q.isEmpty())
//     {
//         int data = q.poll();

//         for(int[] i : graph.get(data))
//         {
//             int a = i[0];
//             int cost = i[1];

//             if(!arr[a])
//             {
//                 arr[a] = true;

//                 if(cost == 1) count++;

//                 q.add(a);
//             }
//         }
//     }
//     return count;
        
//     }
// }


class Solution {
    public int minReorder(int n, int[][] connections) {

    List<List<int[]>> graph = new ArrayList<>();

    for(int i = 0 ; i < n ; i++)
    {
        graph.add(new ArrayList<>());
    }

    for(int[] i : connections)
    {
        int u = i[0];
        int v = i[1];

        graph.get(u).add(new int[]{v, 1});
        graph.get(v).add(new int[]{u,0});
    }

    Queue<Integer> q = new LinkedList<>();
    boolean[] arr = new boolean[n];

    int count = 0;

    q.add(0);
    arr[0] = true;

    while(!q.isEmpty())
    {
        int data = q.poll();

        for(int[] i : graph.get(data))
        {
            int node = i[0];
            int check = i[1];

            if(!arr[node])
            {
                arr[node] = true;

                if(check == 1) count++;

                q.add(node);
            }

        }
    }

    return count;
    
    }
}