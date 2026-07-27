class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i) + 1 );
            }
            else
            {
                map.put(i, 1);
            }
        }

        for(int j : nums)
        {
            if(map.get(j) > nums.length / 2)
            {
                return j;
            };
        }

        return -1;
    }
}