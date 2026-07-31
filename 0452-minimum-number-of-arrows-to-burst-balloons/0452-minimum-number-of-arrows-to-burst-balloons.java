class Solution {
    public int findMinArrowShots(int[][] points) {

        int n = points.length;

        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));

        int[] prev = points[0];

        int count = 1;

        for(int i = 1 ; i < n ; i++)
        {
            int currentStartPoint = points[i][0];
            int currentEndPoint   = points[i][1];

            int prevStartPoint = prev[0];
            int prevEndPoint   = prev[1];

            if(currentStartPoint > prevEndPoint)
            {
                count++;
                prev = points[i];
            }
            else
            {
                prev[0] = Math.max(currentStartPoint, prevStartPoint);
                prev[1] = Math.min(currentEndPoint, prevEndPoint);
            }
        }

        return count;
        
    }
}