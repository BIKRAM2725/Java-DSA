class Solution {
    public int compress(char[] chars) {

       StringBuilder st = new StringBuilder(); 
        
        for(int i = 0 ; i < chars.length ; i++)
        {
            int check = chars[i];
            int count = 1;

            st.append(chars[i]);

            while(i+1 < chars.length && check == chars[i+1])
            {
                count++;
                i++;
            }
            if(count > 1) st.append(count);
        
        }
        for(int i = 0 ; i < st.length() ;i++)
        {
            chars[i] = st.charAt(i);
        }

        return st.length();
    }
}