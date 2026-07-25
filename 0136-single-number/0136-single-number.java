class Solution {
    public int singleNumber(int[] nums) {
        
        int ans = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}

// XOR (^) Rules

// Rule 1 : a ^ a = 0
// Rule 2 : a ^ 0 = a
// Rule 3 : 2 ^ 5 ^ 2 = 2 ^ 2 ^ 5
//         = 5