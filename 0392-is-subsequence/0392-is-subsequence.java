class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length()==0) return true;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int n = arr1.length;

        int p = 0;
        
        for(int i = 0 ; i < arr1.length ;i++)
        {
            for(int j = p ; j < arr2.length ; j++ )
            {
                if(arr1[i] == arr2[j])
                {
                    n--;
                    p = j + 1;

                    break;
                }
            }
            if(n <= 0) return true;
        }
        return false;
    }
}