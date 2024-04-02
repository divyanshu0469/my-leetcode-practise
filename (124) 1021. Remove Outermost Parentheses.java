/* URL : https://leetcode.com/problems/remove-outermost-parentheses/description/ */
class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() == 1) {
            return s;
        } else if (s.length() == 2) {
            return "";
        }
        StringBuilder p = new StringBuilder();
        char[] c = s.toCharArray();
        int open = 1;
        for(int i = 1; i < c.length; i++) {
            if(c[i] == '(') {
                open++;
                if(open > 1) {
                    p.append('(');
                }
            } else {
                if(open > 1) {
                    p.append(')');
                }
                open--;
            }
        }
        return p.toString();
    }
}
