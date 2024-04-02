/* URL : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/ */
class Solution {
    public String removeDuplicates(String s) {
        char[] c= s.toCharArray();
        int slow=-1;
        for( int i =0; i<c.length; i++){
            if(slow>=0 && c[slow]==c[i]) slow--;
            else c[++slow]=c[i];
        }
        return String.valueOf(c,0, slow+1);
    }
}
