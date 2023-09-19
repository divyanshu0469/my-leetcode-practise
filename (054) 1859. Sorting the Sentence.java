/* URL : https://leetcode.com/problems/sorting-the-sentence/ */
class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        int i = 0;
        for (String ss : arr) {
            i = (int) ( ss.charAt (ss.length() - 1) - '0');
            result[i-1] = ss.substring(0, ss.length() - 1);
        }
        return String.join(" ", result);
    }
}
