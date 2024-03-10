/* URL : https://leetcode.com/problems/set-mismatch/ */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length + 1];
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) {//dup
                ans[0] = i;
            } else if (arr[i] == 0) {//miss
                ans[1] = i;
            }
        }
        return ans;
    }
}
