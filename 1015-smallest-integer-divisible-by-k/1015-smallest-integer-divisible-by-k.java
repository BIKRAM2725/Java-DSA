class Solution {
    public int smallestRepunitDivByK(int k) {

        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int div = 1 % k;

        for(int i = 1 ; i <= k ; i++)
        {
            if(div == 0)
            {
               return i;
            }
            else
            {
                div = (div * 10 + 1)%k;
            }

        }
        return -1;
    }
}