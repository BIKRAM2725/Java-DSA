class Solution {
    public int totalNumbers(int[] digits) {

    HashSet<Integer> set = new HashSet<>();

    int count = 0;
        
    for(int i = 0 ; i < digits.length ; i++)
    {
        if(digits[i] == 0)
        continue;

        helper(digits[i]*10, digits, i, set);

    }
    return set.size();
    }

    public void helper(int num , int[] digits, int index, HashSet<Integer> set)
    {

        for(int i = 0; i < digits.length; i++)
        {
            if(i != index)
            {
                int num2 = num+digits[i];
                helper2(num2*10, digits , index, i, set);

            }
            
        }

    }

    public void helper2(int num , int[] digits , int a, int b, HashSet<Integer> set)
    {

        for(int i = 0; i < digits.length; i++)
        {
            if(i != a && i != b)
            {
                int num2 = num+digits[i];
                if(num2 % 2 == 0) 
                {
                    set.add(num2);
                }
            }
        }
    }
    
}