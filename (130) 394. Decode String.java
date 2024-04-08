/* URL : https://leetcode.com/problems/decode-string/description/ */
class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>(); // for storing the number of times a string is to be repeated
        Stack<StringBuilder> stS = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0; 
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) { // 0-9
                n = n * 10 + (c - '0');
            } else if (c == '[') { // [
                st.push(n);
                n = 0;
                stS.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') { // ]
                int k = st.pop();
                StringBuilder temp = sb;
                sb = stS.pop();
                while(k-->0) {
                    sb.append(temp);
                }
            } else { // a-z / A-Z
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
