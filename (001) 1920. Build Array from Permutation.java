/* URL - https://leetcode.com/problems/build-array-from-permutation/description/ */
class Solution {
    public int[] buildArray(int[] nums) {
        int length_og = nums.length;
        int[] ans = new int[length_og];
        int i=0;
        while (i<length_og) {
            ans[i]=nums[nums[i]];
            i++;
        }
        return ans;
    }
} 
