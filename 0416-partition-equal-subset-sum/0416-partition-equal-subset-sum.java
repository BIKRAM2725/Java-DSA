class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        
        for(int i : nums)
        {
            sum += i;
        }

        if(sum % 2 == 1) return false;

        int target = sum / 2;

         int[][] dp = new int[nums.length][target + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = -1;
            }
        }

        return helper(0,nums, target, dp);
    }

    public static boolean helper(int i, int[] nums,int target,int[][] dp)
    {
      
        if(target == 0) return true;
      
        if(i == nums.length) return false;

        if (dp[i][target] != -1) return dp[i][target] == 1;
        

        boolean skip = helper(i+1,nums, target, dp);

        if (target - nums[i] < 0) {
            dp[i][target] = skip ? 1 : 0;
            return skip;
        }

        if(target - nums[i] < 0) return skip;
        boolean take = helper(i+1, nums, target-nums[i], dp);

        dp[i][target] = (skip || take) ? 1 : 0;

        return dp[i][target] == 1;

    }
}