/* URL : https://leetcode.com/problems/shuffle-string/ */
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] array = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            array[indices[i]] = s.charAt(i);
        }
        String str = new String(array);
        return str;
    }
}
