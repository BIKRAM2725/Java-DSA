class Solution {
    public String mergeAlternately(String word1, String word2) {
    
    char[] arr1 = word1.toCharArray();
    char[] arr2 = word2.toCharArray();

    StringBuilder st = new StringBuilder();
    
    int i = 0;
    int j = 0;

    while( i < word1.length() && j < word2.length() )
    {
        st.append(arr1[i]);
        st.append(arr2[j]);

        i++;
        j++;
    }

    while(i < word1.length())
    {
        st.append(arr1[i]);
        i++;
    }

    while(j < word2.length())
    {
        st.append(arr2[j]);
        j++;
    }

    return st.toString();

    }
}