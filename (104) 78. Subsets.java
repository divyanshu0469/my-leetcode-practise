/* URL : https://leetcode.com/problems/subsets/description/ */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        subSet(nums, 0, new ArrayList<>(), outer);
        return outer;
    }
    public void subSet(int[] arr, int index, List<Integer> internal, List<List<Integer>> outer) {
        if (index == arr.length) {
            outer.add(new ArrayList(internal));
            return;
        }
        subSet(arr, index+1, internal, outer);
        internal.add(arr[index]);
        subSet(arr, index+1, internal, outer);
        internal.remove(internal.size()-1);
    }
}
