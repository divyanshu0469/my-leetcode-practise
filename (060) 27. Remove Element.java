/* URL : https://leetcode.com/problems/remove-element/description/ */
class Solution {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        int j = 0;
        int k = 0;
        while ( j < nums.length && nums[j] != Integer.MAX_VALUE ) {
            k++;
            j++;
        }
        return k;
    }
}
