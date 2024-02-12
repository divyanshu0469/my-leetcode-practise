/* URL : https://leetcode.com/problems/binary-search/description/ */
class Solution {
    public int search(int[] nums, int target) {
        return bs (nums, target, 0, nums.length-1);
    }

    public int bs(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if ( nums[mid] > target) {
            return bs(nums,target,start,mid-1);
        } else if ( nums[mid] < target) {
            return bs(nums,target,mid+1,end);
        } else {
            return mid;
        }

    }
}
