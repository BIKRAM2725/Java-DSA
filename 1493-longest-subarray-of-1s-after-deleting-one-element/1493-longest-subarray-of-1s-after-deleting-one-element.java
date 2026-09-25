class Solution {
    public int longestSubarray(int[] nums) {

    int i = 0;
    int left = 0;
    int zerocount = 0;
    int maxcount = 0;

    for(i = 0 ; i < nums.length ; i++)
    {
        if(nums[i] == 0) zerocount++;

        while(zerocount > 1)
        {
            if(nums[left] == 0)
            {
                zerocount--;
            }
            left++;
        }
        
        maxcount = Math.max(maxcount, i - left);
    }

    return maxcount;
        
    }
}