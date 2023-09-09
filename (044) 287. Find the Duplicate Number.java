/* URL : https://leetcode.com/problems/find-the-duplicate-number/ */
class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        //search for the element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return (nums[index]);
            }
        }
        return nums[nums.length-1];
    }
}
