// Bottom-Up DP (Tabulation)

// class Solution {
//     public int fib(int n) {

//         if (n == 0) return 0;
//         if (n == 1) return 1;

//         int a = 0;
//         int b = 1;

//        for(int  i = 2 ; i <= n ; i++)
//        {
//         int temp = a + b;
//             a = b;
//             b = temp;
//        }
//        return b;
//     }
// }


// // Recartion + Memorisation  =  Top Down DP

// class Solution {

//     public int fibo (int n, int[] arr)
//     {
//         if (n == 0) return 0;
//         if (n == 1) return 1;
        
//         if(arr[n] != 0) return arr[n]; // new

//         int ans = fibo(n-1, arr) + fibo(n-2, arr);

//         arr[n] = ans; // new

//         return ans;

//     }
//     public int fib(int n) {
       
//        int[] arr = new int[n + 1];
//        return fibo(n, arr);
//     }
// }



// Tabulation [ You can do using array ] 

// class Solution {

//     public int fib(int n) {

//         if (n <= 1) return n;

//         int[] dp = new int[n + 1];

//         dp[0] = 0;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         return dp[n];
//     }
// }



// // Space Optimisation ( Tabulation )

class Solution {

    public int fib(int n) {

        if (n <= 1) return n;

        int[] dp = new int[3];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }

        return dp[2];
    }
}