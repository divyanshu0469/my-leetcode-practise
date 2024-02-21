/* URL : https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description/ */
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        int indexValue;
        for (int i: nums) {
            sum += i;
            indexValue = i;
            while (indexValue > 0) {
                digitSum += indexValue % 10;
                indexValue /= 10;
            }
        }
        return Math.abs(sum - digitSum);
    }
}
