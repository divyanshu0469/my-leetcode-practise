/* URL : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ */
class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int result = 0 ;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int sum = 0;
            while(num > 0){
                num = num/10;
                sum++;
            }
            if(sum % 2 == 0){
                result++;
            }
        }
        return result;
    }
}
