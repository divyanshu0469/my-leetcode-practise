/* URL : https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/ */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
        List<Integer> ans = new ArrayList<>();
        //search for the element
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index+1);
            }
        } 
        //  (index == nums.length-1) 
        return ans;
    }
}
