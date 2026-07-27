class Solution {
    public int lengthOfLongestSubstring(String s) {

    char[] arr = s.toCharArray();

    HashSet<Character> set = new HashSet<>();

    int n = arr.length;

    int Maxcount = 0;

    int count = 0;

    int j = 0;

    for(int i = 0 ; i < n ; i++)
    {

        while(j < n && !set.contains(arr[j]))
        {
            count++;
            set.add(arr[j]);
            j++;
        }
        Maxcount = Math.max(Maxcount, count);
        
        set.remove(arr[i]);
        count--;
    }

    return Maxcount;
        
    }
}