/* URL : https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/ */
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0, num1 = 0, num2 = 0;
        while (i < s.length()) {
            if (i < s.length()-2 && s.charAt(i+2) == '#') { // if # found
                String twoDigit = "";
                twoDigit += s.charAt(i);
                twoDigit += s.charAt(i+1);
                num2 = Integer.parseInt(twoDigit) + 96;
                res.append((char) num2);
                i += 3;
            } else { // if # not found
                String oneDigit = "";
                oneDigit += s.charAt(i);
                num1 = Integer.parseInt(oneDigit) + 96;
                res.append((char) num1);
                i++;
            }
        }
        return (new String(res));
    }
}
