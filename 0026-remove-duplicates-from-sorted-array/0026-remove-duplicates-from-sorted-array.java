class Solution {
    public int removeDuplicates(int[] nums) {

    ArrayList<Integer> arr = new ArrayList<>();
        
    for(int i = 0; i < nums.length ; i++)
    {
        arr.add(nums[i]);

        while(i < nums.length-1 && nums[i] == nums[i+1])
        {
            i++;
        }  
    }
    for(int i = 0; i < arr.size() ; i++)
    {
        nums[i] = arr.get(i);    
    }
    
    return arr.size();  
    }
}