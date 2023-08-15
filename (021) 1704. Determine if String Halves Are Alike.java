/* URL : https://leetcode.com/problems/determine-if-string-halves-are-alike/ */
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n/2; i++){
            char x = s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
                count1++;
            }
        }
        for(int i = n/2; i < n; i++){
            char x = s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
                count2++;
            }
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
        
    }
}
