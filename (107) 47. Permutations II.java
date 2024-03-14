/* URL : https://leetcode.com/problems/permutations-ii/description/ */
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> uniquePermutations = new HashSet<>();
        permutationsArray(nums, 0, new ArrayList<Integer>(), uniquePermutations);
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(uniquePermutations);
        return ans;
    }
    public void permutationsArray(int[] arr, int index, ArrayList<Integer> holder, Set<List<Integer>> uniquePermutations) {
        if (index == arr.length) {
            List<List<Integer>> ans = new ArrayList<>();
            uniquePermutations.add(new ArrayList<>(holder));
            return;
        }
        int value = arr[index];
        for (int i = 0; i < holder.size()+1; i++) {
            List<Integer> temp = new ArrayList<Integer>(holder);
            temp.add(i, value);
            int ind = index;
            permutationsArray(arr, ++ind, new ArrayList<>(temp), uniquePermutations);
        }
    }
}
