class Solution {
    
    public static int helper(int a, int b)
    {
        int maximum = Math.max(a,b);

        int ans = 0;

        for(int i = 1 ; i <= maximum ; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                ans = i;
            }
        }
        return ans;

    }

    public String gcdOfStrings(String str1, String str2) {
        
        if(!(str1 + str2).equals(str2 + str1))
        {
            return "";
        }

        return str1.substring(0, helper(str1.length(), str2.length()));
    }
}