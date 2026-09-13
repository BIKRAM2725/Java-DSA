//// Your Total Sum + Left Sum approach  Space : O(n)  Time : O(1)

// class Solution {
//     public int pivotIndex(int[] nums) {

//         int totalSum = 0;
        
//         for(int i = 0 ; i < nums.length ; i++)
//         {
//             totalSum = totalSum + nums[i];
//         }

//         int left = 0;

//         for(int i = 0 ; i < nums.length ; i++)
//         {
//             int right = totalSum - left - nums[i];

//             if(left != right)
//             {
//                 left = left + nums[i];
//             }
//             else
//             {
//                 return i;
//             }
//         }
//        return -1;
//     }
// }


// Two Arrays  Space : O(n)  Time : O(n)

class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Left sum
        left[0] = 0;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }

        // Right sum
        right[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }

        // Find pivot
        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }
}