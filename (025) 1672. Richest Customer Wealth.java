/* URL : https://leetcode.com/problems/richest-customer-wealth/ */
class Solution {
    public int maximumWealth(int[][] accounts) {
        int valueOfwealth=0;
        int tempValueOfwealth=0;

        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                tempValueOfwealth=tempValueOfwealth+accounts[i][j];
            }
            if(tempValueOfwealth>valueOfwealth){
                valueOfwealth=tempValueOfwealth;}
                tempValueOfwealth=0;
        }

    return valueOfwealth;}
}
