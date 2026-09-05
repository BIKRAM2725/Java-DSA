// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int n = nums.length;

//         int[] ans = new int[n];

//         ans[0] = 1;

//         for(int i = 1 ; i < n ; i++)
//         {
//             ans[i] = ans[i-1] * nums[i-1];
            
//         }
//         int right = 1;

//         for(int i = n-1 ; i >= 0 ; i--)
//         {
//             ans[i] = ans[i] * right;
//             right = right * nums[i];
//         }
//         return ans;
//     }
// }




// Divide not accected but

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int zero = 0;

        int product = 1;

        int[] ans = new int[n];

        for(int i : nums)
        {
            if(i == 0)
            {
                zero++;
            }
            else
            {
                product *= i;
            }
        }

        if(zero == 1)
        {
            for(int i = 0 ; i < n ; i++)
            {
                if(nums[i] == 0)
                {
                    ans[i] = product;
                }
                else
                {
                    ans[i] = 0;
                }
            }
        }
        else if (zero >= 2)
        {
             for(int i = 0 ; i < n ; i++)
            {
                
                ans[i] = 0;
            
            }

        }
        else
        {
             for(int i = 0 ; i < n ; i++)
            {
                
                    ans[i] = product / nums[i];
                
            }

        }
        return ans;
    }
}


