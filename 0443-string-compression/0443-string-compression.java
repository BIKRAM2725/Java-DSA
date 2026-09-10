class Solution {
    public int compress(char[] chars) {
        
    int i = 0;
    int index = 0;
        while(i < chars.length)
        {
            char check = chars[i];
            int count = 1;

            chars[i] = check;

            while(i+1 < chars.length && check == chars[i+1])
            {
                count++;
                i++;
            }

            chars[index] = chars[i];
            index++;

            if(count  > 1)
            {
                String nums = String.valueOf(count);

                for(int j = 0 ; j < nums.length() ; j++)
                {
                    chars[index] = nums.charAt(j);
                    index++;
                }
            }
            i++;
        }

        return index;
    }
}