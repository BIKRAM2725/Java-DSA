

class Solution {
    public int findPeakElement(int[] nums) {

      int min = 0;
      int max = nums.length - 1;

      while(min < max)
      {
        int mid = min + (max-min) / 2;

        if(nums[mid] < nums[mid+1])
        {
            min = mid + 1;
        }
        else
        {
            max = mid;
        }
      }

      return min;
    }
}