/* URL : https://leetcode.com/problems/add-binary/ */
class Solution {
    public String addBinary(String a, String b) {
        // a = "1010"
        // b = "1011"
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry = carry + (a.charAt(i--) - '0');
            }
            if (j >= 0) {
                carry = carry + (b.charAt(j--) - '0');
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
