/* URL : https://leetcode.com/problems/to-lower-case/ */
class Solution {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            int a = (int)chars[i];
            if((a > 64) && (a < 91)){
                int diff = a + 32;
                chars[i] = (char)diff;
            }
        }
        String str = new String(chars);
        return str;
    }
}
