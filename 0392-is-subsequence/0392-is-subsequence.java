// class Solution {
//     public boolean isSubsequence(String s, String t) {
        
//         char[] arr1 = s.toCharArray();
//         char[] arr2 = t.toCharArray();

//         int cal = 0 ;

//         int i=0;
//         int j=0;

//         while(i<arr1.length && j<arr2.length)
//         {
//                 if ( arr1[i] == arr2[j])
//                 {
//                     cal++;
//                     i++;
//                 }
//             j++;
//         }
//         return cal == arr1.length;
//     }
// }


// class Solution {
//     public boolean isSubsequence(String s, String t) {
       
//        char[] ch1 = s.toCharArray();
//        char[] ch2 = t.toCharArray();

//        int count = 0;

//        int  i = 0;
//        int  j = 0;

//       while(i < ch1.length && j < ch2.length)
//       {
//         if(ch1[i] == ch2[j])
//         {
//             count++;
//             i++;
//             j++;
//         }
//         else
//         {
//             j++;
//         }
//       }
//       if( count == ch1.length)
//       {
//         return true;
//       }

//       return false;
//     }
// }

class Solution {
    public boolean isSubsequence(String s, String t) {

        int p = 0;

        for (int i = 0; i < t.length(); i++) {

            if (p == s.length()) {
                break;
            }

            if (s.charAt(p) == t.charAt(i)) {
                p++;
            }
        }

        return p == s.length();
    }
}