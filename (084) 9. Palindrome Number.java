/* URL : https://leetcode.com/problems/palindrome-number/description/ */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x!=0 && x%10==0)) return false;
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        String s2 = new String(sb.reverse());
        return s.equals(s2);
    }
}
