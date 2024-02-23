/* URL : https://leetcode.com/problems/truncate-sentence/description/ */
import java.util.StringTokenizer;
class Solution {
    public String truncateSentence(String s, int k) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(st.nextToken() + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return new String(sb);
    }
}
