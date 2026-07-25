class Solution {
    public int removeDuplicates(int[] nums) {

    int i = 0;
    int m = 1;
    int ans = 1;

   while(i < nums.length)
    {
        while(m < nums.length && nums[i] == nums[m])
        {
            m++;
        }
        if(m < nums.length)
        {
            nums[i+1] = nums[m];
            ans++;
        }
        i++;       
    }
    return ans;  
    }
}