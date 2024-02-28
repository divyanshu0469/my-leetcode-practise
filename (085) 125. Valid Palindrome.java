/* URL : https://leetcode.com/problems/valid-palindrome/description/ */
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        String ss = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char a = ss.charAt(start);
            char b = ss.charAt(end);
            if (!Character.isLetterOrDigit(a)){
                start++;
            } else if (!Character.isLetterOrDigit(b)){
                end--;
            } else {
                if (a != b) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
