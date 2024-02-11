/* URL : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ */
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> ts = new TreeSet<>();
        for (Integer i: nums) {
            ts.add(i);
        }
        int i = 0;
        for (int setElements: ts) {
            nums[i++] = setElements;
        }
        return ts.size();
    }
}
