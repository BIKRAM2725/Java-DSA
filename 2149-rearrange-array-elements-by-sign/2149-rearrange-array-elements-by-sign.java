class Solution {
    public int[] rearrangeArray(int[] nums) {
    
    int[] arr = new int[nums.length];

    int pos = 0;
    int neg = 1;

    for(int i : nums)
    {
        if(i > 0)
        {
            arr[pos] = i; 
            pos += 2;
        }
        else
        {
            arr[neg] = i;
            neg += 2;
        }
    }
    return arr;
    
    }
}