/* URL : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/ */
class Solution {
    public int reducer(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num%2 == 0) {
            return reducer(num/2, count + 1);
        } else {
            return reducer(num - 1, count + 1);
        }
    }
    public int numberOfSteps(int num) {
        return reducer(num, 0);
    }
}
