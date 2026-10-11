// // BFS: 

// class Solution {
//     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    
//     int n = rooms.size();

//     boolean[] arr = new boolean[n];

//     Queue<Integer> q = new LinkedList<>();

//     q.add(0);
//     arr[0] = true;

//     while(!q.isEmpty())
//     {
//         int data = q.poll();

//         for(int i : rooms.get(data))
//         {
//             if(!arr[i]) 
//             {
//                 arr[i] = true;
//                 q.add(i);
//             }
//         }

//     }

//     for(boolean i : arr)
//     {
//         if(!i) return false;
//     }

//     return true;
        
//     }
// }



// DFS:

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    
    int n = rooms.size();

    boolean[] arr = new boolean[n];

    helper(rooms, arr, 0);

    for(boolean i : arr)
    {
        if(!i) return false;
    }

    return true;
        
    }
    void  helper(List<List<Integer>> rooms,  boolean[] arr, int data)
    {
       if( data >= rooms.size() ) return;

       arr[data] = true;

       for(int j : rooms.get(data))
        {
            if (!arr[j]) 
            {
                helper(rooms, arr, j);
            }
        }
    }
}