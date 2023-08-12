/* URL : https://leetcode.com/problems/count-items-matching-a-rule/ */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int size  = items.size();
        int sum = 0;
        int j;
        if (ruleKey.equals("type")){
            j = 0;
        }
        else if (ruleKey.equals("color")){
            j = 1;
        }
        else{
            j = 2;
        }
        for(int i = 0 ; i < size ; i++){
            if (items.get(i).get(j).equals(ruleValue)){
                    sum = sum + 1;
                }
        }
        return sum;
    }
}
