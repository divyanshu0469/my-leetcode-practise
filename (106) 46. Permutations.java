/* URL : https://leetcode.com/problems/permutations/description/ */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return permutationsArray(nums, 0, new ArrayList<Integer>());
    }
    public List<List<Integer>> permutationsArray(int[] arr, int index, ArrayList<Integer> holder) {
        if (index == arr.length) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(holder));
            return ans;
        }
        List<List<Integer>> total = new ArrayList<>();
        int value = arr[index];

        for (int i = 0; i < holder.size()+1; i++) {
            List<Integer> temp = new ArrayList<Integer>(holder);
            temp.add(i, value);
            int ind = index;
            total.addAll(permutationsArray(arr, ++ind, new ArrayList<>(temp)));
        }
        return total;
    }
}
