class Solution {
    public int longestOnes(int[] nums, int k) {

       int left = 0;

       int i = 0;

       int zerocount = 0;

       int maxcount = 0;

       for(i = 0 ; i < nums.length; i++)
       {
            if(nums[i] == 0)
            {
                zerocount++;
            }
            while(zerocount > k)
            {
                if(nums[left] == 0)
                {
                    zerocount--;
                }
                left++;
            }

            maxcount = Math.max(maxcount, (i - left + 1));
       }

       return maxcount;

    }
    
}