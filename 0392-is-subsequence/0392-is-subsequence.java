class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) return true;
        if (s.length() > t.length()) return false;

        int p = 0;
        int check = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = p; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    p = j + 1;
                    check++;
                    break;
                }
            }
        }

        return check == s.length();
    }
}