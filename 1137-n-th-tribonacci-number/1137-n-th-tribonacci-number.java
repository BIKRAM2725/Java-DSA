class Solution {
    public int tribonacci(int n) {
        
        if(n == 0)
        {
            return 0;
        }
        else if(n==1 || n == 2)
        {
            return 1;
        }
        else
        {
            int one = 0;
            int two = 1;
            int three = 1;
            int fourth = 0;

            for(int i = 0 ; i < n ; i++)
            {
                fourth = one+two+three;

                one = two;
                two = three;
                three = fourth;
            }
            return one;
        }
    }
}