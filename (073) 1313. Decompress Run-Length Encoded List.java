/* URL : https://leetcode.com/problems/decompress-run-length-encoded-list/description/ */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        int[] arr = new int[arrSize];
        int start = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(arr, start, start + nums[i], nums[i+1]);
            start += nums[i];
        }
        return arr;
    }
}
