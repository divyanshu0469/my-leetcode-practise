/* URL : https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/ */
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s: sentences) {
            max = Math.max(max, s.split(" ").length);
        }
        return max;
    }
}
