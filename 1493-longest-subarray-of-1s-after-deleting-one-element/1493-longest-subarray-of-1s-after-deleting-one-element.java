class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;

       int right = 0;

       int zerocount = 0;

       int maxcount = 0;

       for(right = 0 ; right < nums.length ; right++)
       {
           if(nums[right] == 0)
           {
                zerocount++;
           }
           while(zerocount > 1)
           {
            if(nums[left] == 0)
            {
                zerocount--;
            }
            left++;
           }

        maxcount = Math.max(maxcount, right-left+1);
       }

       return maxcount-1;

    }
}