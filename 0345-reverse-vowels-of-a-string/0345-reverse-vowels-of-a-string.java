class Solution {
    public String reverseVowels(String s) {
    
        int i = 0;
        int j = s.length()-1;

        char[] arr = s.toCharArray();

        while(i <= j)
        {
            while(i <= j && !isVowel(arr[i]))
            {
                i++;
            }
            while(i <= j && !isVowel(arr[j]))
            {
                j--;
            }
            if(i <= j && isVowel(arr[i]) && isVowel(arr[j]))
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }


        }

        return new String(arr);
        
    }

    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u';
    }
}