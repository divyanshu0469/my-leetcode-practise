/* URL : https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/ */
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int value1, value2;
        int count = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                value1 = nums.get(i);
                value2 = nums.get(j);
                if ((value1 + value2) < target) count++;
            }
        }
        return count;
    }
}
