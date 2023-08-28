/* URL : https://leetcode.com/problems/arranging-coins/ */
class Solution {
    public int arrangeCoins(int n) {
        int temp = n;
        int i = 1;
        int sum = 1;
        while(temp >= 0){
            temp -= i;
            i++;
            if(temp >= i){
                sum++;
            }
        }
        return sum;
    }
}
