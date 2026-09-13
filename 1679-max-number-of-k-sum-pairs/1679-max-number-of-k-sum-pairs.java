// class Solution {
//     public int maxOperations(int[] nums, int k) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int count = 0;


//         for(int i = 0 ; i < nums.length ; i++)
//         {
//             int compliment = k - nums[i];

//             if(map.getOrDefault(compliment, 0) > 0 )
//             {
//                 count++;
//                 map.put(compliment, map.get(compliment)-1);
//             }
//             else
//             {
//                 map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//             }
//         }
//         return count;
//     }
// }

// // class Solution {
// //     public int maxOperations(int[] nums, int k) {
        
// //         int count = 0;

// //         for(int i = 0 ; i < nums.length ; i++)
// //         {
// //             for(int j = i + 1 ; j < nums.length ; j++)
// //             {
// //                 if (nums[i] == Integer.MIN_VALUE) 
// //                 {
// //                     continue;
// //                 }
// //                 if (nums[j] == Integer.MIN_VALUE)
// //                 {
// //                     continue;
// //                 }
// //                 if(nums[i] + nums[j] == k)
// //                 {
// //                     count++;
// //                     nums[i] = Integer.MIN_VALUE;
// //                     nums[j] = Integer.MIN_VALUE;
// //                     break;
// //                 }
// //             }
// //         }
       
// //         return count ;
// //     }
// // }






class Solution {
    public int maxOperations(int[] nums, int k) {

    int count = 0;
    int left = 0;
    int right = nums.length-1;

    Arrays.sort(nums);

    while(left < right)
    {

        int sum = (nums[left] + nums[right]);
        if(sum == k)
        {
            count++;
            left++;
            right--;
        }
        else if( sum < k)
        {
            left++;
        }
        else
        {
            right--;
        }
    }

    return count;
    }
}